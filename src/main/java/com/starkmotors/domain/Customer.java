package com.starkmotors.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;


public class Customer implements Entity<Customer> {
    private CustomerID id;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;

    public Customer(String firstName, String lastName, String email, Address address) {
        this.id = CustomerID.newId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    @Override
    public boolean hasSameIdentityAs(Customer that) {
        return this.id.equals(that.id);
    }

    public void shiftedTo(Address newAddress){
        address = newAddress;
    }
}
