package com.selfGood.musicMeet.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numPhone;
}
