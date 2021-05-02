package br.com.payroll.service;

import br.com.payroll.entitie.Payment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days) {
        return new Payment("Carlitos", valueOf(200.00), days);
    }
}
