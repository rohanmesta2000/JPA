package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.TravelEntity;
import com.xworkz.fertilizer.repository.TravelRepository;
import com.xworkz.fertilizer.repository.TravelRepositoryImpl;

import java.time.LocalDate;

public class TravelRunner {
    public static void main(String[] args) {


        TravelEntity entity = new TravelEntity(3, "Honnavar", "Shivamogga", 5000, 249, "Girl Meet", "6hrs", "Bike", LocalDate.of(2024, 12, 6), LocalDate.of(2024, 12, 28));
        TravelRepository repository = new TravelRepositoryImpl();
repository.save(entity);

    }
}