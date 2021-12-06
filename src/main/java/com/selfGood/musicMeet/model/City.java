package com.selfGood.musicMeet.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "city's")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cityName;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name ="address_id")
    private Address address;
}
