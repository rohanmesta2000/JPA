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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "disease")
public class DiseaseEntity {
    @Id
    @Column(name = "d_id")
            private int id;
    @Column(name = "diseaseName")
    private String diseaseName;
    @Column(name = "diseaseEffectedPerson")
    private int diseaseEffectedPerson;
    @Column(name = "date")
private LocalDate date;
    @Column(name = "country")
    private String country;
}
