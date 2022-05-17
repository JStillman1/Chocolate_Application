package com.bnta.chocolate.repositories;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ChocolateRepository extends JpaRepository<Chocolate, Long> {



    @Query(value = "SELECT * FROM CHOCOLATE WHERE COCOA_PERCENTAGE > 60;", nativeQuery = true)
    List<Chocolate> over60PercentChoc();

}
