package com.desafio.desafio_libreria_bd.principal;

import com.desafio.desafio_libreria_bd.model.Datos;
import com.desafio.desafio_libreria_bd.model.DatosLibros;
import com.desafio.desafio_libreria_bd.service.ConsumoApi;
import com.desafio.desafio_libreria_bd.service.ConvierteDatos;

import java.util.Scanner;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Principal {
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConvierteDatos conversor = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);

    public void muestraMenu(){
        var json = consumoApi.obtenerDatos(URL_BASE);
        System.out.println(json);
        var datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);
    }
}
