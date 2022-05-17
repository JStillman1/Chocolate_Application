package com.bnta.chocolate.Controller;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.ChocolateService;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EstateController {

    @Autowired
    private EstateService estateService;

    @GetMapping ("/Estate")
    public List<Estate> getAll() {
        return estateService.findAll();
    }

    @PostMapping ("Estate")
    public Estate post (@RequestBody Estate estate){
        return estateService.save(estate);
    }
}
