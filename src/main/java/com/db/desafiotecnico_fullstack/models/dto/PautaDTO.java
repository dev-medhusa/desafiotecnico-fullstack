package com.db.desafiotecnico_fullstack.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
@AllArgsConstructor
public class PautaDTO {
    private UUID id;
    private String titulo;
    private String descricao;
    private Integer tempoVotacao;
    private boolean aberta;


    //getters e setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getTempoVotacao() {
        return tempoVotacao;
    }

    public void setTempoVotacao(Integer tempoVotacao) {
        this.tempoVotacao = tempoVotacao;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
}

