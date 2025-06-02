package com.example.bookreviewapp.domain.usecase;

import androidx.lifecycle.LiveData;

import com.example.bookreviewapp.domain.model.Book;
import com.example.bookreviewapp.data.repository.BookRepository;

import java.util.List;

public class GetBooksUseCase {
    private final BookRepository bookRepository;

    public GetBooksUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public LiveData<List<Book>> execute() {
        return bookRepository.getBooks();
    }
}
