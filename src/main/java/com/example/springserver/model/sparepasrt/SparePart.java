package com.example.springserver.model.sparepasrt;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SparePart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String model;
    private  String type;
    private String name;
    private int price;
    private int number;
    private String model_logo;
    private String type_picture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel_logo() {
        return model_logo;
    }

    public void setModel_logo(String model_logo) {
        this.model_logo = model_logo;
    }

    public String getType_picture() {
        return type_picture;
    }

    public void setType_picture(String type_picture) {
        this.type_picture = type_picture;
    }

    @Override
    public String toString() {
        return "SparePart{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", model_logo='" + model_logo + '\'' +
                ", type_picture='" + type_picture + '\'' +
                '}';
    }
}
