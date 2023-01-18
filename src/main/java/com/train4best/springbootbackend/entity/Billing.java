package com.train4best.springbootbackend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Billing implements Serializable {

    @Id
    private String id;
    private String invoiceNumber;
    @Temporal(TemporalType.TIMESTAMP)
    private Date invoiceDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    private BigDecimal amountBill;
    private String paid;
    private String pelanggan;
    private String institusi;
    private String metodePelatihan;
    private String namaPelatihan;
}
