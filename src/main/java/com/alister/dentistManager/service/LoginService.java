package com.alister.dentistManager.service;


import com.alister.dentistManager.dto.models.Doctor;

public interface LoginService {
Doctor authenticate(String username, String password);

}
