package com.seguranca.publica.registro_ocorrencia.security;

import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    // Hash BCrypt recém gerado para a senha "123456"
    private static final String PASSWORD_HASH = "$2a$10$oG1irxuIQqQU6rrBEu18sOH2dkx0sn9pA2izLQ9NisCo3pqTgoCV6";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Usuário fixo para teste, trocar para buscar do banco futuramente
        if ("admin".equals(username)) {
            return new User("admin",
                    PASSWORD_HASH,
                    List.of(new SimpleGrantedAuthority("ROLE_USER")));
        }
        throw new UsernameNotFoundException("Usuário não encontrado: " + username);
    }

    public static void main(String[] args) {
        String senha = "123456";
        String hash = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder().encode(senha);
        System.out.println("Hash para senha \"" + senha + "\": " + hash);
    }


}
