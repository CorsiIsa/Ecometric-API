CREATE TABLE projetos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(80) NOT NULL,
    pontos_melhorias VARCHAR(255) NOT NULL,
    pontos_principais VARCHAR(255) NOT NULL,
    porcentagem_melhoria VARCHAR(5) NOT NULL
);
