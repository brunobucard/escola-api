CREATE TABLE responsavel (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(50),
	senha VARCHAR(150),
	relacionamento VARCHAR(50),
	telefone VARCHAR(20),
	celular VARCHAR(20),
	logradouro VARCHAR(50),
	numero VARCHAR(20),
	complemento VARCHAR(100),
	referencia VARCHAR(100),
	bairro VARCHAR(100),
	cep VARCHAR(10),
	cidade VARCHAR(50),
	estado VARCHAR(50)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE aluno(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo BOOLEAN NOT NULL,
	data_nascimento DATE NOT NULL,
	sexo VARCHAR(20) NOT NULL,
	religiao VARCHAR(50),
	tipo_sanguineo VARCHAR(20) NOT NULL,
	email VARCHAR(100),
	senha VARCHAR(150),
	nome_pai VARCHAR(50),
	nome_mae VARCHAR(50),
	codigo_responsavel BIGINT(20) NOT NULL,
	FOREIGN KEY (codigo_responsavel) REFERENCES responsavel(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO responsavel (nome, email, senha, relacionamento, telefone, celular, logradouro, numero, complemento, referencia, bairro, cep, cidade, estado) values ('João Pedro', 'joao@email.com', '1234', 'pai', '222647111', '2291111111', 'Rua Unidos', '1', 'casa', 'frente', 'São Cristovão', '28909030', 'Cabo Frio', 'Rio de Janeiro');

INSERT INTO aluno (nome, ativo, data_nascimento, sexo, religiao, tipo_sanguineo, email, senha, nome_pai, nome_mae, codigo_responsavel) values ('Antonio', 1, '2010-01-01', 'MASCULINO', 'Cristão', 'AB_POSITIVO', 'email@email.com', '1234', 'João Pedro', 'Mãe Aluno', 1);