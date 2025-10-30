package com.seguranca.publica.registro_ocorrencia;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestBCrypt {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "123456";
        String encodedPassword = "$2a$10$7Q5N.rZo7hXSUZxWMaNzaehOQSAyC.srJ1RAvEpqSPeDD5Y/uul9W"; // hash usado

        boolean match = encoder.matches(rawPassword, encodedPassword);

        System.out.println("Senha combina? " + match);
    }
}
