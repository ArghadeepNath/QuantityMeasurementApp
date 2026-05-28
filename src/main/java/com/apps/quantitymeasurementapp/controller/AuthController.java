package com.apps.quantitymeasurementapp.controller;

import com.apps.quantitymeasurementapp.service.JwtService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private JwtService jwtService;

    @GetMapping("/api/auth/success")
    public String success(
            @AuthenticationPrincipal OAuth2User principal
    ) {

        String email =
                principal.getAttribute("email");

        String token =
                jwtService.generateToken(email);

        return token;
    }
}

//open at http://localhost:8080/oauth2/authorization/google for auth
//open at http://localhost:8080/swagger-ui/index.html for the apis ui
//http://localhost:8080/oauth2/authorization/google?prompt=select_account
