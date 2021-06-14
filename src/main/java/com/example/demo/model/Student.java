package com.example.demo.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="STUDENTS")

public class Student {

    @Id
    @GeneratedValue
    @Column(name = "Id") @NotNull private int id;
    @Column(name="Name") @NotNull private String name;
    @Column(name="Roll_Number") @NotNull private int rollNumber;

    @Column(name="Studies") @NotNull private String studies;
    @Column(name="Address") @NotNull private String address;
    @Column(name="Fees") @NotNull private double fees;
    @Column(name="Status") @NotNull private String status;

}
