package com.capstone.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cost;
    private String note;

    private Integer category_id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
//    private Date created_At;


    public Expense() {
    }

//    @PrePersist
//    protected void onCreate(){
//        this.created_At = new Date();
//    }




}
