package br.com.payroll.gateway;

import br.com.payroll.entitie.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "worker", url = "${worker.url}", path = "${worker.path}")
public interface WorkerGateway {

    @GetMapping("/{id}")
    ResponseEntity<Worker> findId(@PathVariable Long id);
}
