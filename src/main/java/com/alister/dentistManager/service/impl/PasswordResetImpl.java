package com.alister.dentistManager.service.impl;

import com.alister.dentistManager.Utils.PasswordGenerator;
import com.alister.dentistManager.dto.models.Doctor;
import com.alister.dentistManager.repository.DoctorRepository;
import com.alister.dentistManager.service.PasswordReset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordResetImpl implements PasswordReset {

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private EmailSenderImpl emailService;


    @Override
    public Doctor resetPassword(String email) {
        Doctor doctor = doctorRepository.findByEmail(email);
        if (doctor != null) {
            String newPassword = PasswordGenerator.generateRandomPassword(8);
            doctor.setPassword(newPassword);
            doctorRepository.save(doctor);
            // Enviar correo con la nueva contraseña
            emailService.sendSimpleMessage(email, "Tu nueva contraseña", "Tu nueva contraseña es: " + newPassword);

            return doctor;
        }
        return null;
    }
}
