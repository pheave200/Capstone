package com.hfo.Capstone.models;

import javax.persistence.Entity;

@Entity
public class Recipe extends AbstractEntity{

    private String url;

    public Recipe() {};

    public Recipe(String url) {
        super();
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
