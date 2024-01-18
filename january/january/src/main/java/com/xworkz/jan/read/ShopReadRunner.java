package com.xworkz.jan.read;

import com.xworkz.jan.entity.ShopInfoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopReadRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);
        EntityManager em=emf.createEntityManager();
        System.out.println("EM"+em);

        EntityTransaction et=em.getTransaction();
        System.out.println("ET"+et);
        et.begin();

        System.out.println("ET BEGIN");
        ShopInfoEntity entityFromDB=em.find(ShopInfoEntity.class,2);
        System.out.println("entity found:" +entityFromDB );

        System.out.println("closing em,emf");
        em.close();
        emf.close();
        System.out.println("em and emf closed");


    }
}
