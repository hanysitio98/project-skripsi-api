package com.train4best.springbootbackend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Freelancer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name="id", strategy = "com.train4best.springbootbackend.model.FreelancerIdGenerator")
    @GeneratedValue(generator = "id")
    private String id;
//    private String freelancerNumber;
    private String freelancerName;
    private String idCard;
    private String freelancerImage;
    private String cv;
    private String isActive;
}
