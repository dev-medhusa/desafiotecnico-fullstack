CREATE TABLE associado (
    id BIGSERIAL PRIMARY KEY UNIQUE NOT NULL,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL
);