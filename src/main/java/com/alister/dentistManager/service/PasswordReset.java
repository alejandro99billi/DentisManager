package com.alister.dentistManager.service;

import com.alister.dentistManager.dto.models.Doctor;

public interface PasswordReset {
    Doctor resetPassword(String email);
}
