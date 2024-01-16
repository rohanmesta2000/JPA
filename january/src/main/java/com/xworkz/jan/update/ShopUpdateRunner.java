package com.xworkz.jan.update;

import com.xworkz.jan.entity.ShopInfoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM" + em);
        EntityTransaction et = em.getTransaction();
        et.begin();
        System.out.println("ET begin");

        ShopInfoEntity shopInfoEntity=em.find(ShopInfoEntity.class,2);
        if(shopInfoEntity!=null){
            shopInfoEntity.setName("malnad");
            em.merge(shopInfoEntity);
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
