package com.example.Proyecto.Quiz.Carro.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String matricula;
    private String marca;
    private String modelo;
    private int caballos;


    @ManyToOne
    @JoinColumn(name = "persona_id")
    @JsonBackReference
    private Persona persona;

    public Coche() {
    }

    public Coche(Long id, String matricula, String marca, String modelo, int caballos) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = caballos;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    @Override
    public String toString() {
        return "coche{" +
                "matricula=" + matricula +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", caballos=" + caballos +
                '}';
    }

}


