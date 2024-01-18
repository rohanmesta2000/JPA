package com.xworkz.jan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.naming.Name;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="traffic")
@AllArgsConstructor
public class TrafficEntitiy {
@Id
@Column(name = "t_id")
    private int id;
    @Column(name = "color_Indication")
    private  String colorIndication;
    @Column(name="noOfSides")
    private int noOfSides;
    @Column(name="noOfVehicles")
    private int noOfVehicels;
    @Column(name="district")
    private String district;
    @Column(name="areaName")
    private String areaName;

}
