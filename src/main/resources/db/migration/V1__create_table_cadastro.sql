CREATE TABLE cadastro (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome_empresa VARCHAR(255) NOT NULL,
    nr_cnpj VARCHAR(14) UNIQUE NOT NULL,
    incricao_estadual VARCHAR(20),
    razao_social VARCHAR(255) NOT NULL,
    porte VARCHAR(50),
    data_abertura DATETIME
);
