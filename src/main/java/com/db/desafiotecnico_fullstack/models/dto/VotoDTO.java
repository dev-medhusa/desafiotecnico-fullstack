package com.db.desafiotecnico_fullstack.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
@AllArgsConstructor
public class VotoDTO {
    private UUID id;
    private long associadoId;
    private UUID pautaId;
    private String voto;

    //getters e setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public long getAssociadoId() {
        return associadoId;
    }

    public void setAssociadoId(long associadoId) {
        this.associadoId = associadoId;
    }

    public UUID getPautaId() {
        return pautaId;
    }

    public void setPautaId(UUID pautaId) {
        this.pautaId = pautaId;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }
}
