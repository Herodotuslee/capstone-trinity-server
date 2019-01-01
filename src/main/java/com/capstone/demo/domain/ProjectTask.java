package com.capstone.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;


@Entity
@Data
public class ProjectTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(updatable = false, unique = true)
    private String projectSequence;
//    @NotBlank(message = "Please include a project note")
    private String note;
    private String acceptanceCriteria;
    private String status;
    private Integer priority;
    private Date dueDate;
    //ManyToOne with Backlog
    @ManyToOne(fetch = FetchType.EAGER) //REMOVE REFRESH
    @JoinColumn(name="backlog_id", updatable = false, nullable = false)
    @JsonIgnore
    private Backlog backlog;

    @Column(updatable = false)
    private String projectIdentifier;
    private Date create_At;
    private Date update_At;

    public ProjectTask() {
    }

}
