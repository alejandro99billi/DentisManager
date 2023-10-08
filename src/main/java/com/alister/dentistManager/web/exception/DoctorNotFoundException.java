package com.alister.dentistManager.web.exception;

public class DoctorNotFoundException extends RuntimeException{
    // creo una exepcion personalizada en caso no encuntre un doctor
    public DoctorNotFoundException(Long id) {
        super("Doctor con ID " + id + " no encontrado.");
    }
}
