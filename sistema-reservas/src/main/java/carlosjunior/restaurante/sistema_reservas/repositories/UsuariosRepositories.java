package carlosjunior.restaurante.sistema_reservas.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import carlosjunior.restaurante.sistema_reservas.models.Usuarios;

public interface UsuariosRepositories extends  JpaRepository<Usuarios, UUID>{

}
