package com.example.Proyecto.Quiz.Carro.Servicios;

import com.example.Proyecto.Quiz.Carro.Modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaServicio {

    Optional<Persona> getPersonaById(Long id);

    List<Persona> getAllPersona();

    Optional<Persona> getPersonaBycochematricula(String matricula);

    List<Persona> getpersonaBycochematricula(String matricula);

    Persona savePersona(Persona Persona);

    void updatePersonanombre(Long id, String nombre);

    void deletePersona(Long id);


    List<Persona> getPersonaConcoche();
}
