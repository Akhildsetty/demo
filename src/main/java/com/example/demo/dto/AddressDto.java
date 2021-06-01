package com.example.demo.dto;

import lombok.Data;

@Data
public class AddressDto {

    private Integer id;
    private String houseNumber;
    private String address1;
    private String state;
    private String country;
    private String zipCode;
}
