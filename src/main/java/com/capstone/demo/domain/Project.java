package com.capstone.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Project name is required")
    private String projectName;
    @NotBlank(message = "Project identifier is required")
//    @Size(min=4,max=10,message="Please use 4 to 10 characters")
    @Column(updatable=false,unique=true)
    private String projectIdentifier;
    private String description;
    @JsonFormat(pattern="yyyy-mm-dd")
    private Date start_date;
    @JsonFormat(pattern="yyyy-mm-dd")
    private Date end_date;
    @JsonFormat(pattern="yyyy-mm-dd")
    private Date created_At;
    @JsonFormat(pattern="yyyy-mm-dd")
    private Date updated_At;

    public Project() {
    }

}
