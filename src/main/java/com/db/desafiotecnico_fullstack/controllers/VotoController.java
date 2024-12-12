package com.db.desafiotecnico_fullstack.controllers;


import com.db.desafiotecnico_fullstack.models.dto.VotoDTO;
import com.db.desafiotecnico_fullstack.services.VotoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/votos")
public class VotoController {

    @Autowired
    private VotoServiceImpl votoService;

    @PostMapping //endpoint para registrar voto
    public ResponseEntity<?> registrarVoto(@RequestBody VotoDTO votoDTO) {
        try {
            votoService.votar(votoDTO);
            return new ResponseEntity<>("Voto registrado com sucesso!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


}
