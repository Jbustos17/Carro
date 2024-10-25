package com.example.Proyecto.Quiz.Carro.Repositorio;

import com.example.Proyecto.Quiz.Carro.Modelo.Coche;
import com.example.Proyecto.Quiz.Carro.Modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CocheRepositorio extends JpaRepository<Coche, Long> {


}
