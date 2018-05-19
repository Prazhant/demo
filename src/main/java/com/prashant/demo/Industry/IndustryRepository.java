package com.prashant.demo.Industry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;


public interface IndustryRepository extends JpaRepository <Industry, Integer> {
}
