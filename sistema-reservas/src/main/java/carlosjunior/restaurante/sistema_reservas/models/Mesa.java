package carlosjunior.restaurante.sistema_reservas.models;

import carlosjunior.restaurante.sistema_reservas.Enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mesa {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String nome;

    private Integer capacidade;

    private Status status;

    public Mesa(){

    }

    public Mesa(Long id, String nome, Integer capacidade, Status status) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
}
