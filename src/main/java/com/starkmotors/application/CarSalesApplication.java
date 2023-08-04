package com.starkmotors.application;

import com.starkmotors.domain.Address;
import com.starkmotors.domain.Customer;
import com.starkmotors.domain.CustomerID;

import java.util.UUID;

public class CarSalesApplication {
    public static void main(String[] args) {
        Address address = new Address("Wanowrie"
                ,"Pune"
                ,"411006");
        Customer parikshit = new Customer(
                "Parikshit",
                "Navgire",
                "parikshit@gmail.com",
                address);
        //save the customer
        Address newAddress = new Address("Kondva"
                ,"Pune"
                ,"411007");
        parikshit.shiftedTo(newAddress);
        //save customer
    }
}
