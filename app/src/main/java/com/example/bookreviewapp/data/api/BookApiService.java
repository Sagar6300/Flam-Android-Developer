package com.example.bookreviewapp.data.api;

import com.example.bookreviewapp.data.model.BookResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface BookApiService {

    @GET("books.json") // ← Change this path to match your mock API file name
    Call<List<BookResponse>> getBooks();
}

