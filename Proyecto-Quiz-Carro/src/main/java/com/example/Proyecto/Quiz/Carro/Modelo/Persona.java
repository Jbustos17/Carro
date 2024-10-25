package com.example.Proyecto.Quiz.Carro.Modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table (name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;


    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Coche> coches;

    public Persona() {
    }

    public Persona(String nombre, Long id, String apellido1, String apellido2, String DNI) {
        this.nombre = nombre;
        this.id = id;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.DNI = DNI;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public List<Coche> getCoches() {
        return coches;
    }

    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }

    @Override
    public String toString() {
        return "persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido1=" + apellido1 +
                ", apellido2=" + apellido2 +
                ", DNI=" + DNI +
                '}';
    }

}
