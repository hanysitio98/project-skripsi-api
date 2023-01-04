package com.train4best.springbootbackend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Training implements Serializable {

    @Id
    @GenericGenerator(name="id", strategy = "com.train4best.springbootbackend.model.TrainingIdGenerator")
    @GeneratedValue(generator = "id")
    private String id;
    private String trainingCode;
    private String trainingName;
    private String trainingCategory;
    private String trainingMethod;
    private String trainingDuration;
    @JoinColumn
    @ManyToOne
    private Trainer trainer;
    @Column(columnDefinition = "text")
    private String syllabus;
    private String catalogImage;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date regLimitDate;
    private String locationEvent;
    private String status;
    private BigDecimal priceExcludeTax;
    private BigDecimal priceIncludeTax;
    private BigDecimal vatTax;
    private BigDecimal incomeTax;

}
