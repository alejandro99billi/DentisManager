package com.alister.dentistManager.service.impl;

import com.alister.dentistManager.dto.models.Doctor;
import com.alister.dentistManager.repository.DoctorRepository;
import com.alister.dentistManager.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    DoctorRepository repository;
    @Override
    public Doctor authenticate(String username, String password) {
        Doctor doctor = repository.findByUsername(username);
        if (doctor != null && doctor.getPassword().equals(password)) {
            return doctor;
        }
        return null;
    }
}
