package com.train4best.springbootbackend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Project implements Serializable {

    @Id
    @GenericGenerator(name="id", strategy = "com.train4best.springbootbackend.model.ProjectIdGenerator")
    @GeneratedValue(generator = "id")
    private String id;
    private String taskTitle;
    private String taskDescription;
    private String client;
    private String assignToName;
    private String priority;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    private String status;

}
