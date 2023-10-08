package com.alister.dentistManager.web.controller;

import com.alister.dentistManager.dto.models.Doctor;
import com.alister.dentistManager.dto.playload.LoginPlayload;
import com.alister.dentistManager.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    LoginServiceImpl service;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginPlayload loginRequest) {
        Doctor doctor = service.authenticate(loginRequest.getUsername(), loginRequest.getPassword());
        if (doctor != null) {
            return ResponseEntity.ok(doctor);  // todo retornar un jwt.
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
    }
}
