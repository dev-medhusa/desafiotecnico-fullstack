package com.db.desafiotecnico_fullstack.services;

import com.db.desafiotecnico_fullstack.models.Pauta;
import com.db.desafiotecnico_fullstack.models.dto.PautaDTO;
import com.db.desafiotecnico_fullstack.repositories.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.db.desafiotecnico_fullstack.models.Associado;

import java.util.UUID;


@Service
public class PautaServiceImpl {

    @Autowired
    private PautaRepository pautaRepository;

    public Pauta criarPauta(PautaDTO pautaDTO) {
        Pauta pauta = new Pauta();
        pauta.setTitulo(pautaDTO.getTitulo());
        pauta.setDescricao(pautaDTO.getDescricao());

        int tempoVotacao = pautaDTO.getTempoVotacao() != null ? pautaDTO.getTempoVotacao() : 1;
        pauta.setTempoVotacao(tempoVotacao);

        pautaRepository.save(pauta);
        return pauta;

    }

    public void abrirSessao(UUID id) {
        Pauta pauta = pautaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pauta não encontrada"));
                if (pauta.isAberta()) {
                    throw new IllegalStateException("Sessão já está aberta");
                }

                pauta.setAberta(true);
                pautaRepository.save(pauta);
    }

}
