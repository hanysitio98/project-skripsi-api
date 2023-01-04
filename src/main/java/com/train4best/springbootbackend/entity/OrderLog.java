package com.train4best.springbootbackend.entity;

import lombok.Data;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class OrderLog implements Serializable {

    @Id
    private String id;
    @JoinColumn
    @ManyToOne
    private Registration order;
    private Integer logType;
    private String logMessage;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

}
