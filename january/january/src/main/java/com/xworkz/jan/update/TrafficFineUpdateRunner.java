package com.xworkz.jan.update;


import com.xworkz.jan.entity.TrafficFine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM" + em);
        EntityTransaction et = em.getTransaction();
        et.begin();
        System.out.println("ET begin");
        TrafficFine trafficFine=em.find(TrafficFine.class,2);
        if(trafficFine!=null)
        {
        trafficFine.setVehicleOwner("veeresh");
        em.merge(trafficFine);
            System.out.println("updated successfully");
        }
        else
            System.out.println("details cant be update");
        et.commit();
        System.out.println("closing em and ef");
        em.close();
        emf.close();
    }

}
