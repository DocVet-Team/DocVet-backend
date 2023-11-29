-- INSERT INTO tb_veterinario(cpf, email, nome) VALUES ('000.000.000-00', 'emailZe@gmail.com', 'Ze da Silva');

INSERT INTO tb_pessoa(cpf, nome) VALUES ('12345678911', 'Ricardo Lucas da Silva');
INSERT INTO tb_pessoa(cpf, nome) VALUES ('78945612332', 'Alberto Campos');
INSERT INTO tb_pessoa(cpf, nome) VALUES ('15948723159', 'Lucas dos Santos');

INSERT INTO tb_veterinario(id, crmv) VALUES(1, '65465462');

INSERT INTO tb_telefone(pessoa_id, numero) VALUES(1, '9-0000-0000');
INSERT INTO tb_telefone(pessoa_id, numero) VALUES(1, '9-1111-1111');

INSERT INTO tb_tipo_animal(nome) VALUES ('Cachorro');
INSERT INTO tb_tipo_animal(nome) VALUES ('Gato');
INSERT INTO tb_tipo_animal(nome) VALUES ('Passaro');
INSERT INTO tb_tipo_animal(nome) VALUES ('Peixe');

INSERT INTO tb_especialidade(especialidade) VALUES('Dermatologia');
INSERT INTO tb_especialidade(especialidade) VALUES('Acupuntura');
INSERT INTO tb_especialidade(especialidade) VALUES('Cardiologista');

INSERT INTO tb_vet_esp(vet_id, esp_id) VALUES(1, 1);