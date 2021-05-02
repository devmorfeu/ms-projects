package br.com.payroll.entitie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

@Getter
@Setter
@AllArgsConstructor
public class Payment {

    private String name;

    private BigDecimal dailyIncome;

    private Integer days;

    public BigDecimal getTotal() {
        return dailyIncome.multiply(valueOf(days));
    }
}
