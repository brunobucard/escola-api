CREATE TABLE periodo_letivo (
	codigo BIGINT(50) PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(200) NOT NULL,
	ativo BOOLEAN NOT NULL,
	data_inicio DATE,
	data_termino DATE,
	data_limite_matricula DATE,
	data_acesso_painel DATE,
	bloquear_matricula BOOLEAN,
	aluno_ativo_acesso BOOLEAN
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE grade (
	codigo BIGINT(50) PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(200) NOT NULL,
	carga_horaria_total BIGINT(10),
	conteudo_programatico TEXT	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE turma 
	ADD codigo_periodo_letivo BIGINT(50),
	ADD FOREIGN KEY (codigo_periodo_letivo) REFERENCES periodo_letivo(codigo),
	ADD codigo_grade BIGINT(50),
	ADD FOREIGN KEY (codigo_grade) REFERENCES grade(codigo)
;


INSERT INTO permissao (codigo, descricao) values (64, 'ROLE_PESQUISAR_PERIODO_LETIVO');
INSERT INTO permissao (codigo, descricao) values (65, 'ROLE_REMOVER_PERIODO_LETIVO');
INSERT INTO permissao (codigo, descricao) values (66, 'ROLE_CADASTRAR_PERIODO_LETIVO');
INSERT INTO permissao (codigo, descricao) values (67, 'ROLE_PESQUISAR_GRADE');
INSERT INTO permissao (codigo, descricao) values (68, 'ROLE_REMOVER_GRADE');
INSERT INTO permissao (codigo, descricao) values (69, 'ROLE_CADASTRAR_GRADE');


INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 64);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 65);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 66);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 67);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 68);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 69);


