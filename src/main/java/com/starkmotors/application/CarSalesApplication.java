package com.starkmotors.application;

import com.starkmotors.domain.Car;
import com.starkmotors.domain.Customer;
import com.starkmotors.domain.CustomerID;
import com.starkmotors.domain.Money;

import java.util.Currency;
import java.util.UUID;

public class CarSalesApplication {
    public static void main(String[] args) {
        //get the car details from a request
        Car marutiSwift = Car.createCar(
                "Maruti",
                "Swift",
                2015,
                "Red",
                new Money(5_00_000.00, Currency.getInstance("INR")));
        //persist the car

        marutiSwift.updatePrice(new Money(5_00_000.00, Currency.getInstance("INR")));

        //save the update
    }
}
