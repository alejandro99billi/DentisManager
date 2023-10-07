package com.alister.dentistManager.dto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
@Table(name = "Patient")
public class Patient {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    //usar la anotacion Column solo en caso de alguna especifica de otra forma JPA lo mappa con el mismo atributo
    private String name;
    private String lastName;
    private String email;
    private String fiscalCode;
}
