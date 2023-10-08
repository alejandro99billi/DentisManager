package com.alister.dentistManager.service.impl;


import com.alister.dentistManager.dto.models.Doctor;
import com.alister.dentistManager.repository.DoctorRepository;
import com.alister.dentistManager.service.SingInService;
import com.alister.dentistManager.web.exception.DoctorNotFoundException;
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
        return Optional.ofNullable(repository.findById(id).orElseThrow(() -> new DoctorNotFoundException(id)));
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        if (!repository.existsById(doctor.getId())) {
            throw new DoctorNotFoundException(doctor.getId());
        }
        return repository.save(doctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        if (!repository.existsById(id)) {
            throw new DoctorNotFoundException(id);
        }
        repository.deleteById(id);
    }
}
