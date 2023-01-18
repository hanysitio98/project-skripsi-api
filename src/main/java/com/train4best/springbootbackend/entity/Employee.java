package com.train4best.springbootbackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Employee implements Serializable {

    @Id
    private String id;
    private String employeeName;
    private String position;

}
