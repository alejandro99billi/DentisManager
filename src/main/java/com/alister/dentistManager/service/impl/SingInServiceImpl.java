package com.alister.dentistManager.service.impl;


import com.alister.dentistManager.dto.models.Doctor;
import com.alister.dentistManager.repository.DoctorRepository;
import com.alister.dentistManager.service.SingInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SingInServiceImpl implements SingInService {
    @Autowired
    DoctorRepository repository;

    //hago una sobrescritura de los metodos de mi interfaz
    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return repository.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return repository.findAll();
    }

    @Override
    public Optional<Doctor> getDoctorById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        return repository.save(doctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        repository.deleteById(id);
    }
}
