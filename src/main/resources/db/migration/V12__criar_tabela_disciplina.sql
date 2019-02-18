CREATE TABLE disciplina (
	codigo BIGINT(50) PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(200) NOT NULL,
	abreviacao VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO permissao (codigo, descricao) values (61, 'ROLE_PESQUISAR_DISCIPLINA');
INSERT INTO permissao (codigo, descricao) values (62, 'ROLE_REMOVER_DISCIPLINA');
INSERT INTO permissao (codigo, descricao) values (63, 'ROLE_CADASTRAR_DISCIPLINA');

INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 61);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 62);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 63);