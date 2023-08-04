package com.starkmotors.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Entity<Customer> {
    private CustomerID id;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;

    @Override
    public boolean hasSameIdentityAs(Customer that) {
        return this.id.equals(that.id);
    }

    public void shiftedTo(Address newAddress){
        address = newAddress;
    }
}
