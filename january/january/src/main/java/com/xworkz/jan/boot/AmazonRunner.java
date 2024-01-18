package com.xworkz.jan.boot;

import com.xworkz.jan.entity.AmazonEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AmazonRunner {
    public static void main(String[] args) {

       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
      EntityManager em= emf.createEntityManager();
      EntityTransaction et= em.getTransaction();
      et.begin();
        AmazonEntity amazonEntity=new AmazonEntity(2,"prajwal","LED","Eye-Friendly","10 watt","B3RD","A15",5,"WHITE",290,2);
        AmazonEntity amazonEntity1=new AmazonEntity(3,"Phillips","RADIUM","JIGI JIGI","234FGD","B2SD","12AL",59,"RED",149,7);
em.persist(amazonEntity);
em.persist(amazonEntity1);
et.commit();
em.close();
emf.close();

    }
}

