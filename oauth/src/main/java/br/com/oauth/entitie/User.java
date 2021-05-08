package br.com.oauth.entitie;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public class User {

    private Long id;

    private String name;

    private String email;

    private String password;

    private Set<Role> role = new HashSet<>();
}
