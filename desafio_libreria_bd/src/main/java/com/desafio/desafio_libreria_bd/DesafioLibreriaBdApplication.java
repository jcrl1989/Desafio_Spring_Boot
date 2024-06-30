package com.desafio.desafio_libreria_bd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.desafio.desafio_libreria_bd.principal.Principal;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class DesafioLibreriaBdApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DesafioLibreriaBdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraMenu();
	}
}
