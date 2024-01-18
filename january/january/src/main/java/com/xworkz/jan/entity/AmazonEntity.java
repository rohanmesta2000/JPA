package com.xworkz.jan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Entity
@Table(name = "amazon")
@NoArgsConstructor
public class AmazonEntity {
 @Id
 @Column(name="")
   private int a_id
         ;
 @Column(name="brand")
    private String brand;

 @Column(name="lightType")
    private String  lightType;

 @Column(name="specialFeature")
    private String specialFeature;

 @Column(name="wattage")
    private String wattage;

 @Column(name="bulbShapSize")
    private String bulbShapSize;

 @Column(name="bulbBase")
    private String bulbBase;

 @Column(name="incandescentWattage")
    private int incandescentWattage;

 @Column(name="lightColor")
    private String lightColor;

 @Column(name="voltage")
    private int voltage;

 @Column(name="netQuantity")
    private int netQuantity;
}
