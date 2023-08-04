package com.starkmotors.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

public class Address {
    private String area;
    private String city;
    private String pincode;

    public Address(String area, String city, String pincode) {
        this.area = area;
        this.city = city;
        this.pincode = pincode;
    }
}
