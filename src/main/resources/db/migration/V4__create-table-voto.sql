CREATE TABLE voto (
id BIGSERIAL PRIMARY KEY UNIQUE NOT NULL,
pauta_id BIGINT NOT NULL REFERENCES pauta(id),
associado_id VARCHAR(255) NOT NULL,
voto VARCHAR(3) NOT NULL CHECK (voto IN ('SIM', 'NAO')),
UNIQUE (pauta_id, associado_id)
);