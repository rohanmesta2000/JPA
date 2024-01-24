package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repository.FertilizerRepository;
import com.xworkz.fertilizer.repository.FertilizerRepositoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class FertilizerRunner {
    public static void main(String[] args) {

        FertilizerEntity entity=new FertilizerEntity(2,"Potassium",3,600, LocalDate.of(2023,12,05),LocalDate.of(2024,02,2));
        FertilizerRepository repo=new FertilizerRepositoryImpl();
        repo.save(entity);
    }
}
