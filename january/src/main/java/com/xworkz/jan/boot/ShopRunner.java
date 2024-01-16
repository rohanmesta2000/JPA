package com.xworkz.jan.boot;

import com.xworkz.jan.entity.ShopInfoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopRunner {
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

        ShopInfoEntity shopInfoEntity=new ShopInfoEntity(2,"Venkatesh","GST2Q38932","RAM MANDHIR",560010);
        ShopInfoEntity shopInfoEntity1=new ShopInfoEntity(3,"A2B","GST3827498","BASHYAM CIRCLE",561010);
        em.persist(shopInfoEntity);
        em.persist(shopInfoEntity1);
        System.out.println("operation completed");
        et.commit();
        System.out.println("ET COMMIT");
        System.out.println("closing em and emf");
        em.close();
        emf.close();


    }
}
