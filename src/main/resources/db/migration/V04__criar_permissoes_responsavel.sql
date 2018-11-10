-- permissoes
INSERT INTO permissao (codigo, descricao) values (7, 'ROLE_CADASTRAR_RESPONSAVEL');
INSERT INTO permissao (codigo, descricao) values (8, 'ROLE_REMOVER_RESPONSAVEL');
INSERT INTO permissao (codigo, descricao) values (9, 'ROLE_PESQUISAR_RESPONSAVEL');

-- admin
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 7);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 8);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 9);