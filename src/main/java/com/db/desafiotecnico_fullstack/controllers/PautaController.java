package com.db.desafiotecnico_fullstack.controllers;


import com.db.desafiotecnico_fullstack.models.dto.PautaDTO;
import com.db.desafiotecnico_fullstack.services.PautaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/pautas")
public class PautaController {

    @Autowired
    private PautaServiceImpl pautaService;

    @PostMapping //endpoint para criar nova pauta
    public ResponseEntity<?> criarPauta(@RequestBody PautaDTO pautaDTO) {
        try {
            pautaService.criarPauta(pautaDTO);
            return new ResponseEntity<>("Pauta criada com sucesso",HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/{id}/abrir-sessao") //enpoint para abrir sessao de votacao para uma pauta
    public ResponseEntity<?> abrirSessao(@PathVariable UUID id) {
        try {
            pautaService.abrirSessao(id);
            return new ResponseEntity<>("Sessão de votação aberta com suceso", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
