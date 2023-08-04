package com.starkmotors.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {
    private String houseNo;
    private String floor;
    private String area;
    private String city;
    private String pincode;
}
