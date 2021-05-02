package br.com.worker.controller;

import br.com.worker.entitie.Worker;
import br.com.worker.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.*;
import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/workers")
@RequiredArgsConstructor
public class WorkerController {

    private final WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){

        val response = repository.findAll();

        return status(OK).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findId(@PathVariable Long id){

        val response = repository.findById(id).orElseThrow(() -> new RuntimeException("ID NOT FOUND"));

        return status(OK).body(response);
    }
}
