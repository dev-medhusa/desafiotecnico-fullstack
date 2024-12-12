package com.db.desafiotecnico_fullstack.services;


import com.db.desafiotecnico_fullstack.models.enuns.EscolhaVoto;
import com.db.desafiotecnico_fullstack.models.Pauta;
import com.db.desafiotecnico_fullstack.models.Voto;
import com.db.desafiotecnico_fullstack.models.dto.VotoDTO;
import com.db.desafiotecnico_fullstack.repositories.PautaRepository;
import com.db.desafiotecnico_fullstack.repositories.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotoServiceImpl {

    @Autowired
    private VotoRepository votoRepository;
    @Autowired
    private PautaRepository pautaRepository;

    public Voto votar(VotoDTO votoDTO) {
        Pauta pauta = pautaRepository.findById(votoDTO.getPautaId())
                .orElseThrow(() -> new ResourceNotFoundException("Pauta não encontrada"));

        if (!pauta.isAberta()) {
            throw new IllegalStateException("Sessão de votação está fechada");
        }

        boolean jaVotou = votoRepository.existsByPautaAndAssociadoId
                (votoDTO.getPautaId(),
                votoDTO.getAssociadoId()
                );
            if (jaVotou) {
                throw new IllegalStateException("Associado já votou nesta pauta");
            }

            Voto voto = new Voto();
            voto.setPauta(pauta);
            voto.setAssociadoId(votoDTO.getAssociadoId());
            voto.setVoto(EscolhaVoto.valueOf(votoDTO.getVoto()));


            return votoRepository.save(voto);

    }

}
