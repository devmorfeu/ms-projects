package br.com.oauth.service;

import br.com.oauth.entitie.User;
import br.com.oauth.gateway.userFeign.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserGateway gateway;

    public User findByEmail(String email)  {
        return gateway.findByEmail(email);
    }
}
