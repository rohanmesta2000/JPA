package com.xworkz.jan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="traffficfine")
public class TrafficFine {
    @Id
    @Column(name = "t_id")
    private int id;
    @Column(name = "violation")
    private String violation;
    @Column(name = "vehicleNo")
    private String vehicleNo;
    @Column(name = "vehicleOwner")
    private String vehicleOwner;
    @Column(name = "fine")
    private int fine;


}
