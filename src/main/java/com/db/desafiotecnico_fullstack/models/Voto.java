package com.db.desafiotecnico_fullstack.models;


import com.db.desafiotecnico_fullstack.models.enuns.EscolhaVoto;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Table(name = "voto")
@Entity(name = "voto")
@EqualsAndHashCode(of = "id")
public class Voto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "pauta_id", nullable = false)
    private Pauta pauta;

    @Column(nullable = false)
    private Long associadoId;

    @Enumerated(EnumType.STRING)
    private EscolhaVoto voto; //Sim ou nao

    //getters e setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Pauta getPauta() {
        return pauta;
    }

    public void setPauta(Pauta pauta) {
        this.pauta = pauta;
    }

    public Long getAssociadoId() {
        return associadoId;
    }

    public void setAssociadoId(Long associadoId) {
        this.associadoId = associadoId;
    }

    public EscolhaVoto getVoto() {
        return voto;
    }

    public void setVoto(EscolhaVoto voto) {
        this.voto = voto;
    }
}
