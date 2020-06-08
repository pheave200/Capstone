package com.hfo.Capstone.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Currency;
import java.util.List;

@Entity
public class Item extends AbstractEntity {

    private Double price;

    public Item() {}

    public Item(List<Item> items) {
        super();
        this.price = price;}

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
