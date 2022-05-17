package com.bnta.chocolate.Controller;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChocolateController {

    @Autowired
    private ChocolateService chocolateService;

    @GetMapping ("/Chocolate")
    public List<Chocolate> getAll() {
        return chocolateService.findAll();
    }

    @PostMapping("/Chocolate")
    public Chocolate post(@RequestBody Chocolate chocolate){
        return chocolateService.save(chocolate);
    }


    @GetMapping("/queryTest")
    public List<Chocolate> over60PercentChoc(){
        return chocolateService.over60PercentChoc();
    }

//    @DeleteMapping("/Chocolate")
//    public Chocolate




}
