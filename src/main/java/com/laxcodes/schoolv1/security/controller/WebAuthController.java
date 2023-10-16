package com.laxcodes.schoolv1.security.controller;

import com.swiftcodes.authsample.security.models.AuthRequest;
import com.swiftcodes.authsample.security.models.AuthResponse;
import com.swiftcodes.authsample.security.service.AuthService;
import com.swiftcodes.authsample.security.utils.SecurityConstants;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
