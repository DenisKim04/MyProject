package com.selfGood.musicMeet.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "adder's")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String streetName;
    private String numHouse;
}
