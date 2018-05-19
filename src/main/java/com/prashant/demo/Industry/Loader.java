package com.prashant.demo.Industry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Loader  {


    private IndustryRepository repo;

    @Autowired
    public Loader(IndustryRepository repo) {
        this.repo=repo;
        Industry industry = new Industry();
        industry.setId(123);
        industry.setProgDate(new Date());
        industry.setBillingRefer("abc");
        industry.setIndustryName("xyz");
        repo.save(industry);
        System.out.println("inserted record");
    }
}
