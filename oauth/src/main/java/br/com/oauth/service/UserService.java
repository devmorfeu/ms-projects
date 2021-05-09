package br.com.oauth.service;

import br.com.oauth.entitie.User;
import br.com.oauth.gateway.userFeign.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserGateway gateway;

    public User findByEmail(String email)  {
        return gateway.findByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return gateway.findByEmail(s);
    }
}
