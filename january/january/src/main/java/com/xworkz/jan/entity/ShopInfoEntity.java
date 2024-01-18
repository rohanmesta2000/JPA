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
@Table(name="shopinfo")
public class ShopInfoEntity {
    @Id
    @Column(name="s_id")
    private  int id;
    @Column(name = "name")
    private String name;
    @Column(name = "gstNo")
    private String gstNo;
    @Column(name = "address")
    private String address;
    @Column(name = "pincode")
    private  int pincode;
}
