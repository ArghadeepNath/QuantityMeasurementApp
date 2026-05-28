package com.apps.quantitymeasurementapp.controller;

import com.apps.quantitymeasurementapp.service.JwtService;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class AuthController {

    @Autowired
    private JwtService jwtService;

    @GetMapping("/api/auth/success")
    public void success(
            @AuthenticationPrincipal OAuth2User principal,
            HttpServletResponse response
    ) throws IOException {

        String email =
                principal.getAttribute("email");

        String token =
                jwtService.generateToken(email);

        response.sendRedirect(
                "http://localhost:5173/oauth-success?token=" + token
        );
    }
}