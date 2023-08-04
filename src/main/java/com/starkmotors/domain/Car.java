package com.starkmotors.domain;

/*
As an admin I should be able to add a car to be sold into the system with following details
    - make
    - model
    - year of manufacturing
    - color
 */

import java.util.Currency;
import java.util.UUID;

public class Car implements Entity<Car> {
    private CarId id;
    private String make;
    private String model;
    private Integer yearOfManufacturing;
    private String color;

    private Money price;

    public Car(CarId id, String make, String model, Integer yearOfManufacturing, String color, Money price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearOfManufacturing = yearOfManufacturing;
        this.color = color;
        this.price = price;
    }

    public static Car createCar(String make, String model, Integer yearOfManufacturing, String color, Money price) {
        return new Car(new CarId(UUID.randomUUID()),
                make,
                model,
                yearOfManufacturing,
                color,
                price);
    }

    @Override
    public boolean hasSameIdentityAs(Car that) {
        return this.id.equals(that.id);
    }
}
