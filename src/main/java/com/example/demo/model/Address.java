package com.example.demo.model;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ADDRESS")
public class Address {

    @Id
    @GeneratedValue
    @Column(name="ID")
    private Integer id;

    @Column(name="HOUSE_NUMBER")
    @NotNull
    private String houseNumber;

    @Column(name="ADDRESS1")
    @NotNull
    private String address1;

    @Column(name="ADDRESS2")
    @Nullable
    private String address2;

    @Column(name="STATE")
    @NotNull
    private String state;

    @Column(name="COUNTRY")
    @NotNull
    private String country;

    @Column(name="ZIP_CODE")
    @NotNull
    private String zipCode;
}
