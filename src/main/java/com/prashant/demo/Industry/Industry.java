package com.prashant.demo.Industry;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Industry {

    @GeneratedValue
    @Id
    private Integer id;
    private String industryName;
    private String billingRefer;
    private Date progDate;

}
