package com.alister.dentistManager.dto.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
@Table(name = "patient")
public class Patient {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //anotacion para hacer el id autoincrementable
    private Long id;
    //usar la anotacion Column solo en caso de alguna especifica de otra forma JPA lo mappa con el mismo atributo
    private String name;
    private String lastName;
    private String email;
    private String fiscalCode;
}
