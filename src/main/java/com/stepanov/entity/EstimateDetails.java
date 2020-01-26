package com.stepanov.entity;

import javax.persistence.*;
import java.util.stream.Stream;

@Entity
@Table(name = "estimate_details")
public class EstimateDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String positioName;
    private String unit;
    private int quantity;
    private int price;
    private int cost;
    private String category;

    public EstimateDetails() {
    }

    public EstimateDetails(Integer Id, String positioName, String unit, Integer quantity,
                           Integer price, Integer cost, String category) {
        this.Id = Id;
        this.positioName = positioName;
        this.unit = unit;
        this.quantity = quantity;
        this.price = price;
        this.cost = cost;
        this.category = category;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPositioName() {
        return positioName;
    }

    public void setPositioName(String positioName) {
        this.positioName = positioName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "EstimateDetails{" +
                "Id=" + Id +
                ", positioName='" + positioName + '\'' +
                ", unit='" + unit + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", cost=" + cost +
                ", category='" + category + '\'' +
                '}';
    }
}
