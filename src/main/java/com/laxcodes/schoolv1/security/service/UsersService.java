package com.laxcodes.schoolv1.security.service;
//import lombok.AllArgsConstructor;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//
//@Service
//@AllArgsConstructor
//public class UsersService {
//    private UsersRep usersRepo;
//    private RoleServices roleServices;
//    private PasswordEncoder passwordEncoder;
//    public void registerUser(String username, String password, AppRoles role){
//        Users users = new Users();
//        users.setPassword(passwordEncoder.encode(password));
//        users.setEmail(username);
//        WebRole role1 = roleServices.createOrGetExistingRole(role);
//        users.getRole().add(role1);
//        usersRepo.save(users);
//    }
//}
//TODO created a new usersService so i'll have to transfer the method there and create other necessary methods too
