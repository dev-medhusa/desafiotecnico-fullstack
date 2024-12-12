package com.db.desafiotecnico_fullstack.repositories;

import com.db.desafiotecnico_fullstack.models.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VotoRepository extends JpaRepository<Voto, UUID> {
    boolean existsByPautaAndAssociadoId(UUID pautaId, Long associadoId);

    Long countByPautaIdAndVoto(UUID pautaId, String voto);
}
