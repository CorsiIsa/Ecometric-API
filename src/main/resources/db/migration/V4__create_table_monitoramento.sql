CREATE TABLE monitoramento (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    data_emissao DATETIME,
    porcentagem_diferenca NUMBER(3) NOT NULL,
    melhoria_total VARCHAR(3),
    st_monitoramento VARCHAR(15),
    descricao VARCHAR(225)
);