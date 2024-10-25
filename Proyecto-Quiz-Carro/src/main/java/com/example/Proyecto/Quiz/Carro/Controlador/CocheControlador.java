package com.example.Proyecto.Quiz.Carro.Controlador;


import com.example.Proyecto.Quiz.Carro.Modelo.Coche;
import com.example.Proyecto.Quiz.Carro.Servicios.CocheServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CocheControlador {

    @Autowired
    private CocheServicio cocheServicio;


    @PostMapping("/guardar")
    public ResponseEntity<String> saveDetalle(@RequestBody Coche Coche) {
        Coche nuevoCoche = CocheServicio.SaveCoche(Coche);
        return ResponseEntity.ok("coche Registrado con éxito. matricula: " + nuevoCoche.getMatricula());
    }

}
