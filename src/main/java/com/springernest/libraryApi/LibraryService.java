package com.springernest.libraryApi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    private int nextId = 1;
    private List<Book> books = new ArrayList<>();


    public Book getById(int id) {
        return this.books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public Book add(Book book) {
        book.setId(nextId);
        nextId++;

        this.books.add(book);

        return book;
    }
}


