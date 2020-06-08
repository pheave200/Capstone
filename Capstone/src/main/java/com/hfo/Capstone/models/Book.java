package com.hfo.Capstone.models;

import javax.persistence.Entity;


@Entity
public class Book extends AbstractEntity{

    private String author;

    private String genre;

    public Book() {}

    public Book(String author, String genre) {
        super();
        this.author=author;
        this.genre=genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
