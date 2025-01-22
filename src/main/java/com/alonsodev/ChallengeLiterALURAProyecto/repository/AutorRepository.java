package com.alonsodev.ChallengeLiterALURAProyecto.repository;

import com.alonsodev.ChallengeLiterALURAProyecto.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNombreContainsIgnoreCase(String nombreAutor);

    @Query("SELECT a FROM Autor a WHERE a.fechaNacimiento<= :yearVivo AND a.fechaFallecimiento> :yearVivo")
    List<Autor> autoresVivoDuranteEseYear(int yearVivo);
}
