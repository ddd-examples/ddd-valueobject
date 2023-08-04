package com.starkmotors.application;

import com.starkmotors.domain.Address;
import com.starkmotors.domain.Customer;
import com.starkmotors.domain.CustomerID;

import java.util.UUID;

public class CarSalesApplication {
    public static void main(String[] args) {
        Address address = Address.builder()
                .houseNo("1001 Orchid Palace")
                .floor("1")
                .area("Wanowrie")
                .city("Pune")
                .pincode("411006")
                .build();
        Customer parikshit = new Customer(new CustomerID(UUID.randomUUID()),
                "Parikshit",
                "Navgire",
                "parikshit@gmail.com",
                address);
        //save the customer
        Address newAddress = Address.builder()
                .houseNo("5001 Jay Paradise")
                .floor("5")
                .area("Kondwa")
                .city("Pune")
                .pincode("411007")
                .build();
        parikshit.shiftedTo(newAddress);
    }
}
