package com.xworkz.fertilizer.repository;

import com.xworkz.fertilizer.entity.TravelEntity;

import javax.persistence.*;

public class TravelRepositoryImpl implements TravelRepository {
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(TravelEntity entity) {
        System.out.println("starting save of TravelEntity :" +entity);
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            System.out.println("starting ET");
            et.begin();
            System.out.println("starting persist");
            em.persist(entity);
            System.out.println("persist success");
            et.commit();
            return entity.getId();
        }catch (PersistenceException pe){
            System.err.println("PersistenceException in save method of travelling"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally closing the entity");
            em.close();
        }

        return null;
    }
}
