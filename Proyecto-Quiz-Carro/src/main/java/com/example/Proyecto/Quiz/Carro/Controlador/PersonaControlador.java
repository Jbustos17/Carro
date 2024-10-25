package com.example.Proyecto.Quiz.Carro.Controlador;

import com.example.Proyecto.Quiz.Carro.Modelo.Persona;
import com.example.Proyecto.Quiz.Carro.Servicios.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Personas")
public class PersonaControlador {

    @Autowired
    private PersonaServicio PersonaServicio;

    // Obtener una persona por su ID
    @GetMapping("/{id}")
    public Optional<Persona> getPersonaById(@PathVariable Long id) {
        return PersonaServicio.getPersonaById(id);
    }

    // Obtener todas las personas
    @GetMapping("/todas")
    public List<Persona> getAllProductos() {
        return PersonaServicio.getAllPersona();
    }

    // Crear una Persona
    @PostMapping("/guardar")
    public ResponseEntity<String> saveProducto(@RequestBody Persona persona) {
        Persona savedPersona = PersonaServicio.savePersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Persona registrada con éxito. ID: " + savedPersona.getId());
    }

    // Eliminar Persona por ID
    @DeleteMapping("/eliminar/{id}")
    public void deletePersona(@PathVariable Long id) {
        PersonaServicio.deletePersona(id);
    }

    // Obtener persona con coche
    @GetMapping("/con.coche")
    public ResponseEntity<List<Persona>> getPersonaConcoche() {
        List<Persona> Persona = PersonaServicio.getPersonaConcoche();
        return ResponseEntity.ok(Persona);
    }

    }

