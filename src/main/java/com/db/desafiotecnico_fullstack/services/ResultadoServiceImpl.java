package com.db.desafiotecnico_fullstack.services;

import com.db.desafiotecnico_fullstack.models.Pauta;
import com.db.desafiotecnico_fullstack.models.dto.ResultadoDTO;
import com.db.desafiotecnico_fullstack.repositories.PautaRepository;
import com.db.desafiotecnico_fullstack.repositories.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ResultadoServiceImpl {

    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private PautaRepository pautaRepository;

    public ResultadoDTO calcularResultado(UUID pautaId) {
        Pauta pauta = pautaRepository.findById(pautaId)
                .orElseThrow(() -> new RuntimeException("Pauta não encontrada"));

        Long votosSim = votoRepository.countByPautaIdAndVoto(pautaId, "SIM");
        Long votosNao = votoRepository.countByPautaIdAndVoto(pautaId, "NAO");

        Long totalVotos = votosSim + votosNao;

        return new ResultadoDTO(pautaId, pauta.getTitulo(), votosSim, votosNao, totalVotos);

    }


}
