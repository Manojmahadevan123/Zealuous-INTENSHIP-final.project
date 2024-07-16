package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ITR_entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itrId;
    private int itrNumber;
    private int itryear;
    private String itrFormType;
    private int  itrIncome;
    private int itrexpenses;
    private int itrtaxPayable;
}
