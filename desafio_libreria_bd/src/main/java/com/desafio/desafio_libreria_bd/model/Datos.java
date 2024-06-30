package com.desafio.desafio_libreria_bd.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Datos(
        @JsonAlias("results") List<DatosLibros> resultados
) {

}
