package com.capstone.demo.domain;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cost;
    private String note;



    private String category_id;


    public Expense() {
    }



}
