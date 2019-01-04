package com.capstone.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Project name is required")
    private String projectName;
    @NotBlank(message ="Project Identifier is required")
    @Column(updatable = false, unique = true)
    private String projectIdentifier;
    @NotBlank(message = "Project description is required")
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date start_date;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date end_date;
//    @JsonFormat(pattern = "yyyy-mm-dd")
//    @Column(updatable = false)
//    private Date created_At;
//    @JsonFormat(pattern = "yyyy-mm-dd")
//    private Date updated_At;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "project")
    @JsonIgnore
    private Backlog backlog;

    public Project() {
    }

//
//    @PrePersist
//    protected void onCreate(){
//        this.created_At = new Date();
//    }
//
//    @PreUpdate
//    protected void onUpdate(){
//        this.updated_At = new Date();
//    }

}
