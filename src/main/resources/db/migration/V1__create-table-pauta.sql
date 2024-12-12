CREATE TABLE pauta (
    id BIGSERIAL PRIMARY KEY UNIQUE NOT NULL,
    titulo VARCHAR(255) NOT NULL,
    descricao TEXT,
    tempo_votacao INTEGER,
    aberta BOOLEAN DEFAULT false
);