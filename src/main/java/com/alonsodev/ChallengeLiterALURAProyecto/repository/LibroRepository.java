package com.alonsodev.ChallengeLiterALURAProyecto.repository;

import com.alonsodev.ChallengeLiterALURAProyecto.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    boolean existsByTitulo(String tituloLibro);

    @Query("SELECT l FROM Libro l WHERE l.idiomas LIKE %:idioma%")
    List<Libro> librosPorIdioma(String idioma);
}
