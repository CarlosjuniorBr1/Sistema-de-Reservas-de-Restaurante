package carlosjunior.restaurante.sistema_reservas.models;

import java.sql.Date;
import java.util.UUID;

import carlosjunior.restaurante.sistema_reservas.Enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reservas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID usuarioId; 
    private Long mesaId;
    private Date dataReserva;
    private Status status;

    public Reservas(){
    }


    public Reservas(Long id, UUID usuarioId, Long mesaId, Date dataReserva, Status status) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.mesaId = mesaId;
        this.dataReserva = dataReserva;
        this.status = status;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(UUID usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getMesaId() {
        return mesaId;
    }

    public void setMesaId(Long mesaId) {
        this.mesaId = mesaId;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
}
