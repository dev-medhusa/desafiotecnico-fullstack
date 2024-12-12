package com.db.desafiotecnico_fullstack.models.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
public class ResultadoDTO {

    private UUID pautaId;
    private String tituloPauta;
    private Long votosSim;
    private Long votosNao;
    private Long totalVotos;


    //construtor sem parametros
    public ResultadoDTO() {}

    //constructor

    public ResultadoDTO(UUID pautaId, String tituloPauta, Long votosSim, Long votosNao, Long totalVotos) {
        this.pautaId = pautaId;
        this.tituloPauta = tituloPauta;
        this.votosSim = votosSim;
        this.votosNao = votosNao;
        this.totalVotos = totalVotos;
    }


    //getters e setters


    public UUID getPautaId() {
        return pautaId;
    }

    public void setPautaId(UUID pautaId) {
        this.pautaId = pautaId;
    }

    public String getTituloPauta() {
        return tituloPauta;
    }

    public void setTituloPauta(String tituloPauta) {
        this.tituloPauta = tituloPauta;
    }

    public Long getVotosSim() {
        return votosSim;
    }

    public void setVotosSim(Long votosSim) {
        this.votosSim = votosSim;
    }

    public Long getVotosNao() {
        return votosNao;
    }

    public void setVotosNao(Long votosNao) {
        this.votosNao = votosNao;
    }

    public Long getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(Long totalVotos) {
        this.totalVotos = totalVotos;
    }
}
