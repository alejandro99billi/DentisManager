package com.alister.dentistManager.repository;

import com.alister.dentistManager.dto.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    //defino el repositorio de implementar en mi servicio
    //Si devo agregar un metodo custom puedo usar la anotacion @Query
}
