package com.xworkz.jan.boot;

import com.xworkz.jan.entity.FilmEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner {
    public static void main(String[] args) {
        System.out.println("created successfully");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);
       EntityManager em= emf.createEntityManager();
        System.out.println("EM"+em);


      EntityTransaction et= em.getTransaction();
        System.out.println("ET" +et);
        et.begin();
        System.out.println("ET Begins");
        System.out.println("starting operation");
        FilmEntity filmEntity=new FilmEntity(6,"om","rishabh","kannada","shetty",900013);
em.persist(filmEntity);

        System.out.println("operation complted");
        et.commit();
        System.out.println("ET COMMIT");
        System.out.println("closing em and emf");
        em.close();
        emf.close();

    }

}
