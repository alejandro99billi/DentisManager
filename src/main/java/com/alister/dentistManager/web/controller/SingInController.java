package com.alister.dentistManager.web.controller;

import com.alister.dentistManager.dto.models.Doctor;
import com.alister.dentistManager.service.impl.SingInServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class SingInController {
    //Hago todas las llamadas de interes
    @Autowired
    SingInServiceImpl service;

    // CREATE
    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return service.saveDoctor(doctor);
    }

    // READ
    @GetMapping
    public List<Doctor> getAllDoctors() {
        return service.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        return service.getDoctorById(id).orElse(null);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor) {
        doctor.setId(id); // Ensure the ID is set on the entity to update
        return service.updateDoctor(doctor);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
       service.deleteDoctor(id);
    }

}
