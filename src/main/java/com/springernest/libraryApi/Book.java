package com.springernest.libraryApi;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Book {
    private int id; //- unikalny identyfikator ksiazki
    String title; //- tytul ksiazki
    String author;// - imie i nazwisko autora
    int publicationYear; //- rok publikacji

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void setId(int id) {
        this.id = id;
    }
}
