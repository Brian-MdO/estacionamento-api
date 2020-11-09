CREATE TABLE cliente(
    id BIGINT(20) UNIQUE PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL,
    telefone VARCHAR(20) NOT NULL
);

CREATE TABLE veiculo(
    id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    placa VARCHAR(10),
    modelo VARCHAR(20) NOT NULL,
    id_cliente BIGINT(20) NOT NULL,
    
	CONSTRAINT fk_cliente_viculo FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);

CREATE TABLE vaga(
    id BIGINT(20) UNIQUE PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    status_vaga VARCHAR(50) NOT NULL,
    valor_hora_vaga DECIMAL(10,2) NOT NULL
);

CREATE TABLE ticket(
    id BIGINT(20) UNIQUE PRIMARY KEY AUTO_INCREMENT,
    data_hora_entrada DATETIME NOT NULL,
    data_hora_saida DATETIME,
    status_ticket VARCHAR(50) NOT NULL,
    valor_total DECIMAL(10,2),
    id_veiculo BIGINT(20) NOT NULL,
    id_vaga BIGINT(20) NOT NULL,
    
	CONSTRAINT fk_veiculo_ticket FOREIGN KEY (id_veiculo) REFERENCES veiculo(id),
    CONSTRAINT fk_vaga_ticket FOREIGN KEY (id_vaga) REFERENCES vaga(id)
);