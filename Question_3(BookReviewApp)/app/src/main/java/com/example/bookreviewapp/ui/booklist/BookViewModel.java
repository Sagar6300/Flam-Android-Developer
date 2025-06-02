package com.example.bookreviewapp.ui.booklist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.bookreviewapp.data.repository.BookRepository;
import com.example.bookreviewapp.domain.model.Book;
import com.example.bookreviewapp.domain.usecase.GetBooksUseCase;

import java.util.List;

public class BookViewModel extends ViewModel {

    private final GetBooksUseCase getBooksUseCase;

    public BookViewModel() {
        BookRepository repository = new BookRepository();
        getBooksUseCase = new GetBooksUseCase(repository);
    }

    public LiveData<List<Book>> getBooks() {
        return getBooksUseCase.execute();
    }
}

