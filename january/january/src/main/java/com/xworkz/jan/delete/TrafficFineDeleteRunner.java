package com.xworkz.jan.delete;


import com.xworkz.jan.entity.TrafficFine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineDeleteRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        System.out.println("EM"+em);
        EntityTransaction et=em.getTransaction();
        et.begin();
        System.out.println("ET BEGIN");
        TrafficFine trafficFine=em.find(TrafficFine.class,2);
        if(trafficFine!=null){
            em.remove(trafficFine);
            System.out.println("data deleted successfully");
        }
        else
            System.out.println("details cant be delete");
        et.commit();
        System.out.println("closing em and ef");
        em.close();
        emf.close();

    }

}

