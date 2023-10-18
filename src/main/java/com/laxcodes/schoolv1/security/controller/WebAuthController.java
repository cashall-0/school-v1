package com.laxcodes.schoolv1.security.controller;

import com.laxcodes.schoolv1.security.models.AuthRequest;
import com.laxcodes.schoolv1.security.models.AuthResponse;
import com.laxcodes.schoolv1.security.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class WebAuthController {
    private final AuthService authService;
    @PostMapping("/authenticate")
    public ResponseEntity<?> generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        return ResponseEntity.ok(new AuthResponse(authService.authenticateUser(authRequest)));
    }
}
