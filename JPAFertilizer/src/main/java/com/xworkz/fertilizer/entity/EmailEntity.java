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
@Table(name="email")
public class EmailEntity {
    @Id
    @Column(name = "e_id")
    private int id;
    @Column(name = "address")
    private String address;
    @Column(name = "to")
    private String to;
    @Column(name = "cc")
    private String cc;
    @Column(name = "bcc")
    private String bcc;
    @Column(name = "subject")
    private String subject;
    @Column(name = "sentDate")
    private LocalDate sentDate;
    @Column(name = "success")
    private Boolean success;
    @Column(name = "efrom")
    private String from;


}


