package com.example.Proyecto.Quiz.Carro.Repositorio;

import com.example.Proyecto.Quiz.Carro.Modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaRepositorio extends JpaRepository <Persona , Long> {


    // Actualizar nombre por ID
    @Modifying
    @Query("UPDATE Persona p SET p.nombre = :nombre WHERE p.id = :id")
    void updatePersonaNombre(@Param("id") Long id, @Param("nombre") String nombre);

    @Query("SELECT p FROM Persona p INNER JOIN p.Coche d")
    List<Persona> findpersonaconCoche();
}
