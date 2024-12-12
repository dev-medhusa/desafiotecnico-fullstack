package com.db.desafiotecnico_fullstack.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Table(name = "associado")
@Entity(name = "associado")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class Associado {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

}
