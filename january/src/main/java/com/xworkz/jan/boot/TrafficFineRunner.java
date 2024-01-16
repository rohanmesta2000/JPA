package com.xworkz.jan.boot;


import com.xworkz.jan.entity.TrafficFine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);
       EntityManager em=emf.createEntityManager();
        System.out.println("Em"+em);
      EntityTransaction et=em.getTransaction();
        System.out.println("Et"+et);
        et.begin();
        System.out.println("ET BEGINS");
        System.out.println("Starting Opeartion");
        TrafficFine trafficFineEntity1=new TrafficFine(3,"Signal broken","KA47U4799","Dheeraj",899);
        em.persist(trafficFineEntity1);
        System.out.println("opeartion completed");
        et.commit();
        System.out.println("ET COMMIT");
        System.out.println("closing em and emf");
        em.close();
        emf.close();
    }

}