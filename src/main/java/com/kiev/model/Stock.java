package com.kiev.model;

import com.kiev.enums.Availability;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stock {

    @Id
    @GeneratedValue
    private Long id;
    private double price;
    private Availability stockAvailability;


   /* @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private Item item;*/

    public String stock;


    public Stock() {
    }

    public Stock(double price) {
        super();
        this.price = price;
        this.stockAvailability = Availability.NO;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Availability getStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(Availability stockAvailability) {
        this.stockAvailability = stockAvailability;
    }
}


