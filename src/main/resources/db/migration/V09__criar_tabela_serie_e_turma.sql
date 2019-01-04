CREATE TABLE sala (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	sala VARCHAR(30) NOT NULL,
	limite_pessoa BIGINT(10),
	tamanho DECIMAL(10,2),
	observacao TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE serie (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(60) NOT NULL
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
CREATE TABLE turma (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	turma VARCHAR(150) NOT NULL,
	vaga INTEGER,
	periodo VARCHAR(200),
	codigo_sala BIGINT(20),
	FOREIGN KEY (codigo_sala) REFERENCES sala(codigo),
	codigo_serie BIGINT(20) NOT NULL,
	FOREIGN KEY (codigo_serie) REFERENCES serie(codigo)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
CREATE TABLE turma_funcionario (
	codigo_turma BIGINT(50) NOT NULL,
	codigo_funcionario BIGINT(50) NOT NULL,
	PRIMARY KEY (codigo_turma, codigo_funcionario),
	FOREIGN KEY (codigo_turma) REFERENCES serie(codigo),
	FOREIGN KEY (codigo_funcionario) REFERENCES turma(codigo)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	

INSERT INTO serie (codigo, descricao) values (1, 'Creche 1');
INSERT INTO serie (codigo, descricao) values (2, 'Creche 2');
INSERT INTO serie (codigo, descricao) values (3, 'Creche 3');
INSERT INTO serie (codigo, descricao) values (4, 'Creche 4');
INSERT INTO serie (codigo, descricao) values (5, 'Pré 1');
INSERT INTO serie (codigo, descricao) values (6, 'Pré 2');
INSERT INTO serie (codigo, descricao) values (7, '1º ano');
INSERT INTO serie (codigo, descricao) values (8, '2º ano');
INSERT INTO serie (codigo, descricao) values (9, '3º ano');
INSERT INTO serie (codigo, descricao) values (10, '4º ano');
INSERT INTO serie (codigo, descricao) values (11, '5º ano');
INSERT INTO serie (codigo, descricao) values (12, '6º ano');
INSERT INTO serie (codigo, descricao) values (13, '7º ano');
INSERT INTO serie (codigo, descricao) values (14, '8º ano');
INSERT INTO serie (codigo, descricao) values (15, '9º ano');

