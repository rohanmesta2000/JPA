package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.EmailEntity;
import com.xworkz.fertilizer.repository.EmailRepository;
import com.xworkz.fertilizer.repository.EmailRepositoryImpl;

import java.time.LocalDate;

public class EmailRunner {
    public static void main(String[] args) {
        EmailEntity entity=new EmailEntity(5,"hotmail","manoj@hotmail.com","rahul@hotmail.com","raju@gmail.com","holiday", LocalDate.of(2024,02,10),true,"PARU@GMAIL.com");
        EmailRepository repository=new EmailRepositoryImpl();
        repository.save(entity);
    }
}
