package com.alister.dentistManager.dto.playload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * @author alejandro
 * */

@Getter @Setter @ToString
public class ResetPasswordPlayload {
    private String email;
}
