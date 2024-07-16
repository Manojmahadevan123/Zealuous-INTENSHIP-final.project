package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ITR_JPA extends JpaRepository<ITR_entity,Integer> {
    List<ITR_entity> findAllByItrNumber(int itrNumber);
}
