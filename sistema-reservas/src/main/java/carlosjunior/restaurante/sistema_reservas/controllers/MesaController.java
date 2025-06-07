package carlosjunior.restaurante.sistema_reservas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

     @PostMapping("mesas")
    public ResponseEntity<Mesa> createAnylis(@RequestBody Mesa mesa){
        Mesa savedMesa = repository.save(mesa);
        return ResponseEntity.ok(savedMesa);
    }


}
