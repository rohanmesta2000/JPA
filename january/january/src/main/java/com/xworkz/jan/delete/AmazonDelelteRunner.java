package com.xworkz.jan.delete;

import com.xworkz.jan.entity.AmazonEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AmazonDelelteRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        System.out.println("EM"+em);
        EntityTransaction et=em.getTransaction();
        et.begin();
        System.out.println("ET begin");
        AmazonEntity amazonEntity=em.find(AmazonEntity.class,2);

        if (amazonEntity !=null){
            em.remove(amazonEntity);
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
