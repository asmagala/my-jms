package com.kodilla.myjms.domain;

import java.io.Serializable;

public class BookOrderDto implements Serializable {
    private final String buyer;
    private final String isbn;
    private final Integer quantity;

    public BookOrderDto(String buyer, String isbn, Integer quantity) {
        this.buyer = buyer;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public String getBuyer() {
        return buyer;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Current order: \nbuyer = " + buyer + "\nisbn = " + isbn + "\nquantity = " + quantity.toString();
    }

}
