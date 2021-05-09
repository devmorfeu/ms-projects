package br.com.user.controller;

import br.com.user.entitie.User;
import br.com.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {

        val user = repository.findById(id).orElseThrow(() -> new RuntimeException("ID NOT FOUND"));

        return status(OK).body(user);
    }

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {

        val user = repository.findByEmail(email);

        return status(OK).body(user);
    }
}
