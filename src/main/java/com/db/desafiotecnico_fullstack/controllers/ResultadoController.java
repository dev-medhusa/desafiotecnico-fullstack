package com.db.desafiotecnico_fullstack.controllers;


import com.db.desafiotecnico_fullstack.models.dto.ResultadoDTO;
import com.db.desafiotecnico_fullstack.services.ResultadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/resultados")
public class ResultadoController {

    @Autowired
    private ResultadoServiceImpl resultadoService;

    @GetMapping("/{pautaId")
    public ResponseEntity<ResultadoDTO> calcularResultado(@PathVariable UUID  pautaId) {
        try {
            ResultadoDTO resultado = resultadoService.calcularResultado(pautaId);
            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } catch (Exception e) {
            ResultadoDTO erroResultado = new ResultadoDTO();
            return new ResponseEntity<>(erroResultado, HttpStatus.BAD_REQUEST);
        }
    }

}
