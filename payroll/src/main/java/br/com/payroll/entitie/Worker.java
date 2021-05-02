package br.com.payroll.entitie;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Worker {

    private Long id;

    private String name;

    private BigDecimal dailyIncome;
}
