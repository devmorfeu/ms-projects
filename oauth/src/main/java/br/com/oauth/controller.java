package br.com.oauth;

import br.com.oauth.entitie.User;
import br.com.oauth.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class controller {

    private final UserService service;

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail (@RequestParam String email) {

        val user = service.findByEmail(email);

        return status(OK).body(user);
    }
}
