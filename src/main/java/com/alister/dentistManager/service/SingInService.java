package com.alister.dentistManager.service;


import com.alister.dentistManager.dto.models.Doctor;

import java.util.List;
import java.util.Optional;

public interface SingInService {
//Defino en mi interfaz de el servicio los metodos de firma del CRUD

    // CREATE
    Doctor saveDoctor(Doctor doctor);

    // READ
    List<Doctor> getAllDoctors() ;

    Optional<Doctor> getDoctorById(Long id);

    // UPDATE
    Doctor updateDoctor(Doctor doctor) ;
    // DELETE
    void deleteDoctor(Long id) ;
}
