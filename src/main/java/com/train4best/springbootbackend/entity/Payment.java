package com.train4best.springbootbackend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Payment implements Serializable {

    @Id
    private String id;
    private String paymentMethod;

}
