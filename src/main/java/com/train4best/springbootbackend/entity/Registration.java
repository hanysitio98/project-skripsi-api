package com.train4best.springbootbackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Registration implements Serializable {

    @Id
    private String id;
    private String training;
    private String traineeName;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    private String email;
    private String phoneNumber;
    private String company;
    private String tertiaryEducation;
    private String occupation;
    private String trainingMethod;
    private String paymentMethod;
    private String amount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;
    private String participantCount;
    private String isPaid;



}
