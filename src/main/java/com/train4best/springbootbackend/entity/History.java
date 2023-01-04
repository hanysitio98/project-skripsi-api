package com.train4best.springbootbackend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
@Data
public class History implements Serializable {

    @Id
    private String id;
    @JoinColumn
    @OneToOne
    private Training training;
    private String linkReport;
    private String linkDoc;
    private String linkRecording;

}
