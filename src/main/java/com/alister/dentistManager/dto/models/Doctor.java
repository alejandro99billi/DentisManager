package com.alister.dentistManager.dto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
@Table(name = "Doctor")
public class Doctor {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String lastName;
    private String password;
    private String email;
    private String fiscalCode;
    private String username;

}
