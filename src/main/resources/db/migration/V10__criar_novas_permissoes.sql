-- permissoes
INSERT INTO permissao (codigo, descricao) values (10, 'ROLE_PESQUISAR_TURMA');
INSERT INTO permissao (codigo, descricao) values (11, 'ROLE_REMOVER_TURMA');
INSERT INTO permissao (codigo, descricao) values (12, 'ROLE_CADASTRAR_TURMA');

INSERT INTO permissao (codigo, descricao) values (13, 'ROLE_PESQUISAR_SALA');
INSERT INTO permissao (codigo, descricao) values (14, 'ROLE_REMOVER_SALA');
INSERT INTO permissao (codigo, descricao) values (15, 'ROLE_CADASTRAR_SALA');

INSERT INTO permissao (codigo, descricao) values (16, 'ROLE_PESQUISAR_FUNCIONARIO');
INSERT INTO permissao (codigo, descricao) values (17, 'ROLE_REMOVER_FUNCIONARIO');
INSERT INTO permissao (codigo, descricao) values (18, 'ROLE_CADASTRAR_FUNCIONARIO');

INSERT INTO permissao (codigo, descricao) values (19, 'ROLE_PESQUISAR_DISCIPLINA');
INSERT INTO permissao (codigo, descricao) values (20, 'ROLE_REMOVER_DISCIPLINA');
INSERT INTO permissao (codigo, descricao) values (21, 'ROLE_CADASTRAR_DISCIPLINA');

INSERT INTO permissao (codigo, descricao) values (22, 'ROLE_PESQUISAR_GRADE');
INSERT INTO permissao (codigo, descricao) values (23, 'ROLE_REMOVER_GRADE');
INSERT INTO permissao (codigo, descricao) values (24, 'ROLE_CADASTRAR_GRADE');

INSERT INTO permissao (codigo, descricao) values (25, 'ROLE_PESQUISAR_PERIODO');
INSERT INTO permissao (codigo, descricao) values (26, 'ROLE_REMOVER_PERIODO');
INSERT INTO permissao (codigo, descricao) values (27, 'ROLE_CADASTRAR_PERIODO');

INSERT INTO permissao (codigo, descricao) values (28, 'ROLE_PESQUISAR_VALOR');
INSERT INTO permissao (codigo, descricao) values (29, 'ROLE_REMOVER_VALOR');
INSERT INTO permissao (codigo, descricao) values (30, 'ROLE_CADASTRAR_VALOR');

INSERT INTO permissao (codigo, descricao) values (31, 'ROLE_PESQUISAR_MATRICULA');
INSERT INTO permissao (codigo, descricao) values (32, 'ROLE_REMOVER_MATRICULA');
INSERT INTO permissao (codigo, descricao) values (33, 'ROLE_CADASTRAR_MATRICULA');

INSERT INTO permissao (codigo, descricao) values (34, 'ROLE_PESQUISAR_OCORRENCIA');
INSERT INTO permissao (codigo, descricao) values (35, 'ROLE_REMOVER_OCORRENCIA');
INSERT INTO permissao (codigo, descricao) values (36, 'ROLE_CADASTRAR_OCORRENCIA');

INSERT INTO permissao (codigo, descricao) values (37, 'ROLE_PESQUISAR_AGENDA');
INSERT INTO permissao (codigo, descricao) values (38, 'ROLE_REMOVER_AGENDA');
INSERT INTO permissao (codigo, descricao) values (39, 'ROLE_CADASTRAR_AGENDA');

INSERT INTO permissao (codigo, descricao) values (40, 'ROLE_PESQUISAR_NOTA');
INSERT INTO permissao (codigo, descricao) values (41, 'ROLE_REMOVER_NOTA');
INSERT INTO permissao (codigo, descricao) values (42, 'ROLE_CADASTRAR_NOTA');

INSERT INTO permissao (codigo, descricao) values (43, 'ROLE_PESQUISAR_CONTEUDO');
INSERT INTO permissao (codigo, descricao) values (44, 'ROLE_REMOVER_CONTEUDO');
INSERT INTO permissao (codigo, descricao) values (45, 'ROLE_CADASTRAR_CONTEUDO');

INSERT INTO permissao (codigo, descricao) values (46, 'ROLE_PESQUISAR_FALTA');
INSERT INTO permissao (codigo, descricao) values (47, 'ROLE_REMOVER_FALTA');
INSERT INTO permissao (codigo, descricao) values (48, 'ROLE_CADASTRAR_FALTA');

INSERT INTO permissao (codigo, descricao) values (49, 'ROLE_PESQUISAR_CENTRO_CUSTO');
INSERT INTO permissao (codigo, descricao) values (50, 'ROLE_REMOVER_CENTRO_CUSTO');
INSERT INTO permissao (codigo, descricao) values (51, 'ROLE_CADASTRAR_CENTRO_CUSTO');

INSERT INTO permissao (codigo, descricao) values (52, 'ROLE_PESQUISAR_FORNECEDOR');
INSERT INTO permissao (codigo, descricao) values (53, 'ROLE_REMOVER_FORNECEDOR');
INSERT INTO permissao (codigo, descricao) values (54, 'ROLE_CADASTRAR_FORNECEDOR');

INSERT INTO permissao (codigo, descricao) values (55, 'ROLE_PESQUISAR_MOVIMENTACAO');
INSERT INTO permissao (codigo, descricao) values (56, 'ROLE_REMOVER_MOVIMENTACAO');
INSERT INTO permissao (codigo, descricao) values (57, 'ROLE_CADASTRAR_MOVIMENTACAO');

INSERT INTO permissao (codigo, descricao) values (58, 'ROLE_PESQUISAR_ESTOQUE');
INSERT INTO permissao (codigo, descricao) values (59, 'ROLE_REMOVER_ESTOQUE');
INSERT INTO permissao (codigo, descricao) values (60, 'ROLE_CADASTRAR_ESTOQUE');

-- admin
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 10);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 11);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 12);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 13);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 14);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 15);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 16);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 17);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 18);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 19);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 20);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 21);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 22);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 23);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 24);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 25);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 26);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 27);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 28);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 29);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 30);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 31);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 32);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 33);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 34);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 35);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 36);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 37);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 38);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 39);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 40);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 41);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 42);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 43);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 44);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 45);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 46);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 47);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 48);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 49);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 50);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 51);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 52);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 53);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 54);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 55);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 56);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 57);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 58);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 59);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 60);