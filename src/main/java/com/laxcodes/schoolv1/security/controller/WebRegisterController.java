package com.laxcodes.schoolv1.security.controller;

import com.swiftcodes.authsample.security.models.RegRequest;
import com.swiftcodes.authsample.security.models.WebRole;
import com.swiftcodes.authsample.security.service.UsersService;
import com.swiftcodes.authsample.security.utils.AppRoles;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class WebRegisterController {
    private UsersService usersService;
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegRequest regRequest){
        usersService.registerUser(regRequest.getUsername(), regRequest.getPassword(), AppRoles.ADMIN);
        return new ResponseEntity<>("registration successful", HttpStatus.ACCEPTED);
    }
    @GetMapping("/my")
    public ResponseEntity<String> testing (){
        System.out.println("its working perfectly");
        return new ResponseEntity<>("everything works", HttpStatus.FOUND);
    }

}
