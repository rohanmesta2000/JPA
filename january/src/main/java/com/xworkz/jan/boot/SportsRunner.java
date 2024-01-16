package com.xworkz.jan.boot;



import com.xworkz.jan.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);
        EntityManager em=emf.createEntityManager();
        System.out.println("EM"+em);

        EntityTransaction et=em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("ET BEGINS");
        System.out.println("Starting Operation");
        SportEntity sportEntity=new SportEntity(2,"football","india","sunil",7);
        SportEntity sportEntity1=new SportEntity(3,"kabaddi","india","pawan",7);


        em.persist(sportEntity);
        em.persist(sportEntity1);

        System.out.println("operation completed");
        et.commit();
        System.out.println("ET COMMIT");
        System.out.println("closing em and emf");
        em.close();
        emf.close();


    }
}
