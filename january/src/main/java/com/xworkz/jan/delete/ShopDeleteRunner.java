package com.xworkz.jan.delete;



import com.xworkz.jan.entity.ShopInfoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopDeleteRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM" + em);
        EntityTransaction et = em.getTransaction();
        et.begin();
        System.out.println("ET begin");
        ShopInfoEntity shopInfoEntity=em.find(ShopInfoEntity.class,2);



        if (shopInfoEntity !=null){
            em.remove(shopInfoEntity);
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
