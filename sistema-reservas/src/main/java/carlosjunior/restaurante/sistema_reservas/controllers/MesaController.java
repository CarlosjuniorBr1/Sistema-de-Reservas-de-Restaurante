package carlosjunior.restaurante.sistema_reservas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import carlosjunior.restaurante.sistema_reservas.models.Mesa;
import carlosjunior.restaurante.sistema_reservas.repositories.MesaRepository;

@RestController
public class MesaController {

    @Autowired
    private MesaRepository repository;

    @GetMapping("mesas")
    public List<Mesa> getMesas(){
        return repository.findAll();
    }
}
