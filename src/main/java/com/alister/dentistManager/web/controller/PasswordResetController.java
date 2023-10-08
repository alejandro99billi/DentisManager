package com.alister.dentistManager.web.controller;

import com.alister.dentistManager.dto.models.Doctor;
import com.alister.dentistManager.dto.playload.ResetPasswordPlayload;
import com.alister.dentistManager.service.impl.PasswordResetImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reset-password")
public class PasswordResetController {

    @Autowired
    private PasswordResetImpl passwordResetService;

    @PostMapping
    public ResponseEntity<String> resetPassword(@RequestBody ResetPasswordPlayload request) {
        Doctor doctor = passwordResetService.resetPassword(request.getEmail());

        if (doctor != null) {
            return new ResponseEntity<>("Correo de restablecimiento enviado.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Email no encontrado.", HttpStatus.NOT_FOUND);
        }
    }
}