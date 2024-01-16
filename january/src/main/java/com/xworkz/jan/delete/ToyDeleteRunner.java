package com.xworkz.jan.delete;

import com.xworkz.jan.entity.ToyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToyDeleteRunner {
    public static void main(String[] args) {
      EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
   EntityManager em=emf.createEntityManager();
        System.out.println("EM"+em);
        EntityTransaction et=em.getTransaction();
        et.begin();
        System.out.println("ET begin");
        ToyEntity toyEntity=em.find(ToyEntity.class,2);

        if (toyEntity !=null){
            em.remove(toyEntity);
            System.out.println("data deleted succesfully");
        }
       else
            System.out.println("details cant be delete");
        et.commit();
        System.out.println("closing em and ef");
        em.close();
        emf.close();


    }
}
