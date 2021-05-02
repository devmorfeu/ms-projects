package br.com.payroll.service;

import br.com.payroll.entitie.Payment;
import br.com.payroll.gateway.WorkerGateway;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final WorkerGateway gateway;

    public Payment getPayment(Long workerId, Integer days) {

        val worker = gateway.findId(workerId).getBody();

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
