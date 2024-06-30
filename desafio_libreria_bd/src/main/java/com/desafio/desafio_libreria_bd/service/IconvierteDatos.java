package com.desafio.desafio_libreria_bd.service;

public interface IconvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);

}
