package com.xworkz.jan.boot;

import com.xworkz.jan.entity.TrafficEntitiy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficRunner {
    public static void main(String[] args) {
   EntityManagerFactory  emf =Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);
       EntityManager em=emf.createEntityManager();
        System.out.println("EM"+em);

       EntityTransaction et=em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("ET BEGINS");
        System.out.println("Starting Operation");
        TrafficEntitiy trafficEntitiy=new TrafficEntitiy(2,"red",4,98,"Majestic","Banglore");
        em.persist(trafficEntitiy);
        System.out.println("operation completed");
        et.commit();
        System.out.println("ET COMMIT");
        System.out.println("closing em and emf");
        em.close();
        emf.close();


    }
}

