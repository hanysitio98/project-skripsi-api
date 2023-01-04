package com.train4best.springbootbackend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name="id", strategy = "com.train4best.springbootbackend.model.TrainerIdGenerator")
    @GeneratedValue(generator = "id")
    private String id;
    private String trainerCode;
    private String trainerName;
    private String skill;
    private String cv;
    private String competenciesCertificate;
    private String isActive;
    @JoinColumn
    @ManyToOne
    private Freelancer freelancer;
}
