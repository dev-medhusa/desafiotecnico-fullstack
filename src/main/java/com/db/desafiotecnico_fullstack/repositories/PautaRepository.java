package com.db.desafiotecnico_fullstack.repositories;
import com.db.desafiotecnico_fullstack.models.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PautaRepository extends JpaRepository<Pauta, UUID> {
}
