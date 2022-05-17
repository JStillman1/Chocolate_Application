package com.bnta.chocolate.config;


import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DBSeeder implements ApplicationRunner {


    @Autowired
    private EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Estate e1 = new Estate("Estate 1", "Argentina");
        Estate e2 = new Estate("Estate 2", "Belgium");
        Estate e3 = new Estate("Estate 3", "Nigeria");
        Estate e4 = new Estate("Estate 4", "Switzerland");
        Estate e5 = new Estate("Estate 5", "Ghana");

        Chocolate c1 = new Chocolate("chocolate1", 55, e1);
        Chocolate c2 = new Chocolate("chocolate2", 30, e2);
        Chocolate c3 = new Chocolate("chocolate3", 60, e3);
        Chocolate c4 = new Chocolate("chocolate4", 20, e4);
        Chocolate c5 = new Chocolate("chocolate5", 75, e5);
        Chocolate c6 = new Chocolate("chocolate6", 25, e1);
        Chocolate c7 = new Chocolate("chocolate7", 45, e2);
        Chocolate c8 = new Chocolate("chocolate8", 60, e3);
        Chocolate c9 = new Chocolate("chocolate9", 90, e4);
        Chocolate c10 = new Chocolate("chocolate10", 85, e5);

        e1.setChocolates(List.of(c1, c6));
        e2.setChocolates(List.of(c2, c7));
        e3.setChocolates(List.of(c3, c8));
        e4.setChocolates(List.of(c4, c9));
        e5.setChocolates(List.of(c5, c10));



        estateRepository.saveAll(List.of(e1, e2, e3, e4, e5));
    }
}
