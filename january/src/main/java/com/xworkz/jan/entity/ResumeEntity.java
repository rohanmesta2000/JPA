package com.xworkz.jan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "resume")
@AllArgsConstructor
public class ResumeEntity {
@Id
@Column(name="r_id")
    private int id;
    @Column(name="name")
    private String  name;
    @Column(name="college")
    private String college;
    @Column(name="qualification")
    private String qualification;
    @Column(name = "place")
    private  String place;
    @Column(name="cpga")
    private int cgpa;
}
