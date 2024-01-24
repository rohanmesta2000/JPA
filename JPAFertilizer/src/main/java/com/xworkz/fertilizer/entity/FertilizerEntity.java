package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="fertilizer")
public class FertilizerEntity {
    @Id
    @Column(name = "f_id")
    private int id;
    @Column(name = "name")
    private String fName;
    @Column(name = "quantity")
    private int fQuantity;
    @Column(name = "cost")
    private int cost;
    @Column(name = "manufacture_date")
    private LocalDate manufactureDate;
    @Column(name = "expiry_date")
    private LocalDate expiryDate;

}
