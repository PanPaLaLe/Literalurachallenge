package com.alonsodev.ChallengeLiterALURAProyecto;

import com.alonsodev.ChallengeLiterALURAProyecto.principal.Principal;
import com.alonsodev.ChallengeLiterALURAProyecto.repository.AutorRepository;
import com.alonsodev.ChallengeLiterALURAProyecto.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeLiterAluraProyectoApplication implements CommandLineRunner {

    @Autowired
    private LibroRepository repositorioLibro;
    @Autowired
    private AutorRepository repositorioAutor;

    public static void main(String[] args) {
        SpringApplication.run(ChallengeLiterAluraProyectoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(repositorioLibro, repositorioAutor);
        principal.iniciar();
    }
}
