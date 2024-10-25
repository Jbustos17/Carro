package com.example.Proyecto.Quiz.Carro.Servicios;

import com.example.Proyecto.Quiz.Carro.Modelo.Coche;
import com.example.Proyecto.Quiz.Carro.Repositorio.CocheRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class CocheServiciolmpl implements CocheServicio {

    @Autowired
    private CocheServiciolmpl cocheServiciolmpl;

    @Override
    public Coche saveCoche(Coche Coche) {
        return CocheRepositorio.save(Coche);
    }
}
