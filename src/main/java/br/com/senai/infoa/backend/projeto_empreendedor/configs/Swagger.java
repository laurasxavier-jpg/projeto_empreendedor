package br.com.senai.infoa.backend.projeto_empreendedor.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Moda e autocuidado",
        version = "1.0",
        description = "API para o sistema de moda e autocuidado. Loja de roupas, acessoríos e produtos de cuidado"
    )
)
public class Swagger {

}