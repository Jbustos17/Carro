package com.example.Proyecto.Quiz.Carro.Servicios;

import com.example.Proyecto.Quiz.Carro.Modelo.Persona;
import com.example.Proyecto.Quiz.Carro.Repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiciolmpl implements PersonaServicio {

    @Autowired
    private PersonaRepositorio PersonaRepositorio;


    @Override
    public Optional<Persona> getPersonaById(Long id) {
        return PersonaRepositorio.findById(id);
    }

    @Override
    public List<Persona> getAllPersona() {
        return PersonaRepositorio.findAll();
    }

    @Override
    public Optional<Persona> getPersonaBycochematricula(String matricula) {
        return PersonaRepositorio.findBycochematricula(matricula);
    }

    @Override
    public List<Persona> getpersonaBycochematricula(String matricula) {
        return PersonaRepositorio.findAllBycochematricula(matricula);
    }

    @Override
    public Persona savePersona(Persona Persona) {
        return PersonaRepositorio.save(Persona);
    }

    @Override
    public void updatePersonanombre(Long id, String nombre) {
        PersonaRepositorio.updatePersonaNombre(id, nombre);

    }

    @Override
    public void deletePersona(Long id) {
        PersonaRepositorio.deleteById(id);

    }

    @Override
    public List<Persona> getPersonaConcoche() {
        return PersonaRepositorio.findpersonaconCoche();
    }
}
