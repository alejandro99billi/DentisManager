package com.alister.dentistManager.conf;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {
    //usa las anotaciones para que que spring sepa que es una configuracion que debe usar swagger
    //bean para habilitar la documentacion del proyecto
    //todo usar swagger con un profile unico

    @Bean
    public OpenAPI dentistManagerAPI() {
        return new OpenAPI()
                .info(new Info().title("Dentist Manager")
                        .description("Application for manager of a dentist study")
                        .version("1.0"));
    }

}
