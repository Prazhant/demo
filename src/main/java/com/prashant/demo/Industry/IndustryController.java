package com.prashant.demo.Industry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class IndustryController {

    @Autowired
    private IndustryRepository repo;

    @GetMapping("/industry/{id}")
    public List<Industry> getIndustry(@PathVariable("id") Integer id){
        return repo.findAll();

    }

    @PostMapping("/industry")
    public  void save(Industry industry){
        //some code added
        repo.save(industry);
    }
}
