package carlosjunior.restaurante.sistema_reservas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import carlosjunior.restaurante.sistema_reservas.models.Mesa;

public interface MesaRepository extends JpaRepository<Mesa, Long> {

}
