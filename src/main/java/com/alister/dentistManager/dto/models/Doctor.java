package com.alister.dentistManager.dto.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
@Table(name = "doctor")
public class Doctor {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //anotacion para hacer el id autoincrementable
    private Long id;
    private String name;
    private String lastName;
    private String password;
    private String email;
    private String fiscalCode;
    private String username;

}
