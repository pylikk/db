package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String area;
    private String address;
    private int flatArea;
    private int numbOfRooms;
    private int price;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFlatArea() {
        return flatArea;
    }

    public void setFlatArea(int flatArea) {
        this.flatArea = flatArea;
    }

    public int getNumbOfRooms() {
        return numbOfRooms;
    }

    public void setNumbOfRooms(int numbOfRooms) {
        this.numbOfRooms = numbOfRooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String area, String address, int flatArea, int numbOfRooms, int price) {
        this.area = area;
        this.address = address;
        this.flatArea = flatArea;
        this.numbOfRooms = numbOfRooms;
        this.price = price;


    }
}



