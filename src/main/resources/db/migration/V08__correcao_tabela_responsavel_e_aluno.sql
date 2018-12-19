ALTER TABLE responsavel
	CHANGE COLUMN cpf cpf VARCHAR(15)
	;
	
ALTER TABLE aluno
	ADD medico_telefone VARCHAR(40),
	ADD autorizado_nome1 VARCHAR(50),
	ADD autorizado_identidade1 VARCHAR(50),
	ADD autorizado_telefone1 VARCHAR(50),
	ADD autorizado_nome2 VARCHAR(50),
	ADD autorizado_identidade2 VARCHAR(50),
	ADD autorizado_telefone2 VARCHAR(50),
	ADD transporte VARCHAR(200),
	ADD necessidade_especial_outra VARCHAR(100),
	ADD especialista_acompanhamento BOOLEAN,
	ADD especialista_descricao VARCHAR(200)
	;
	