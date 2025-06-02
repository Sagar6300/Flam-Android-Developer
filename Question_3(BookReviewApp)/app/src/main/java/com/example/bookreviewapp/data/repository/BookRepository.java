package com.example.bookreviewapp.data.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.bookreviewapp.data.api.BookApiService;
import com.example.bookreviewapp.data.api.RetrofitClient;
import com.example.bookreviewapp.data.model.BookResponse;
import com.example.bookreviewapp.domain.model.Book;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookRepository {
    private BookApiService apiService;

    public BookRepository() {
        apiService = RetrofitClient.getInstance().create(BookApiService.class);
    }

    public LiveData<List<Book>> getBooks() {
        MutableLiveData<List<Book>> booksLiveData = new MutableLiveData<>();

        apiService.getBooks().enqueue(new Callback<List<BookResponse>>() {
            @Override
            public void onResponse(Call<List<BookResponse>> call, Response<List<BookResponse>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<Book> books = new ArrayList<>();
                    for (BookResponse br : response.body()) {
                        books.add(new Book(
                                br.getId(),
                                br.getTitle(),
                                br.getAuthor(),
                                br.getThumbnail(),
                                br.getDescription(),
                                br.getRating()
                        ));
                    }
                    booksLiveData.setValue(books);
                } else {
                    booksLiveData.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<List<BookResponse>> call, Throwable t) {
                booksLiveData.setValue(null);
            }
        });

        return booksLiveData;
    }
}

