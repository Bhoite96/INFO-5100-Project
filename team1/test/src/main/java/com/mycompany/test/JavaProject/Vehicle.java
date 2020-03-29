/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.JavaProject;

/**
 *
 * @author yiyizhou
 */
public class Vehicle {
    private String id;
    private String dealerId;
    private String brand;
    private String model;
    private String dateofmanufacturing;
    private String type;
    private String category;
    private String color;
    private float price;
    private float mileage;

    public Vehicle(String id, String dealerId, String brand, String model, String dateofmanufacturing, String type, String category, String color, float price, float mileage) {
        this.id = id;
        this.dealerId = dealerId;
        this.brand = brand;
        this.model = model;
        this.dateofmanufacturing = dateofmanufacturing;
        this.type = type;
        this.category = category;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
    }
}
