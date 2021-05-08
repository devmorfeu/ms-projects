package br.com.oauth.gateway.userFeign;

import br.com.oauth.entitie.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user", path = "/users")
public interface UserGateway {

    @GetMapping("/search")
    User findByEmail(@RequestParam String email);
}
