package com.transporte.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Sistema de Transporte Escolar e de Funcionários")
                .version("v1.0")
                .description("API para gestão de transporte escolar e de funcionários, incluindo controle de alunos, motoristas, veículos, rotas, presenças e usuários do sistema.")
                .termsOfService("https://sistematransporteescolar.org/termos")
                .license(new License()
                    .name("Apache License 2.0")
                    .url("https://www.apache.org/licenses/LICENSE-2.0.html")
                )
            );
    }
}