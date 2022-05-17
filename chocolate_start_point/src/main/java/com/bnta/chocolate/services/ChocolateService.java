package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChocolateService {

    @Autowired
    private ChocolateRepository chocolateRepository;

    public List<Chocolate> findAll(){
        return chocolateRepository.findAll();
    }

    public Chocolate save(Chocolate chocolate){
        return chocolateRepository.save(chocolate);
    }

    public List<Chocolate> over60PercentChoc() {
        return chocolateRepository.over60PercentChoc();
    }

    public void remove(Long id){
        chocolateRepository.delete(chocolateRepository.getById(id));
    }
}
