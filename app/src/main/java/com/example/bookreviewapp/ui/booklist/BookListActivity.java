package com.example.bookreviewapp.ui.booklist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookreviewapp.R;

public class BookListActivity extends AppCompatActivity {

    private BookListAdapter adapter;
    private BookViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewBooks);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new BookListAdapter();
        recyclerView.setAdapter(adapter);

        viewModel = new ViewModelProvider(this).get(BookViewModel.class);
        viewModel.getBooks().observe(this, books -> {
            if (books != null) {
                adapter.setBooks(books);
            }
        });
    }
}

