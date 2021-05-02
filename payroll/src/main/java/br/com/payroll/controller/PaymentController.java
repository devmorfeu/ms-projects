package br.com.payroll.controller;

import br.com.payroll.entitie.Payment;
import br.com.payroll.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

import static java.math.BigDecimal.*;
import static org.springframework.http.HttpStatus.*;
import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService service;

    @GetMapping("{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId,
                                              @PathVariable Integer days) {

        val payment = service.getPayment(workerId, days);

        return status(OK).body(payment);
    }

}
