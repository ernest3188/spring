package com.springernest.libraryApi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


    public List<Book> getByTitle(String title) {
        return this.books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());

    }

    public void deleteById(int id) {
        this.books.removeIf(book -> book.getId() == id);
    }

    public Book modifyBook(Book book) {

        Book originalBook = getById(book.getId());

        originalBook.setTitle(book.getTitle());
        originalBook.setAuthor(book.getAuthor());
        originalBook.setPublicationYear(book.getPublicationYear());

        return originalBook;

    }
}


