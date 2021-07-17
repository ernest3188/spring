package com.springernest.libraryApi;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

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
