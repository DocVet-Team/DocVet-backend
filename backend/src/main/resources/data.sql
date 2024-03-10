-- Tipos de Animais
INSERT INTO tipo_animal (nome) VALUES ('Cachorro');
INSERT INTO tipo_animal (nome) VALUES ('Gato');
INSERT INTO tipo_animal (nome) VALUES ('Coelho');
INSERT INTO tipo_animal (nome) VALUES ('Hamster');
INSERT INTO tipo_animal (nome) VALUES ('Peixe');
INSERT INTO tipo_animal (nome) VALUES ('Pássaro');
INSERT INTO tipo_animal (nome) VALUES ('Cavalo');
INSERT INTO tipo_animal (nome) VALUES ('Tartaruga');
INSERT INTO tipo_animal (nome) VALUES ('Porquinho-da-índia');
INSERT INTO tipo_animal (nome) VALUES ('Furão');
INSERT INTO tipo_animal (nome) VALUES ('Iguana');
INSERT INTO tipo_animal (nome) VALUES ('Periquito');
INSERT INTO tipo_animal (nome) VALUES ('Serpente');
INSERT INTO tipo_animal (nome) VALUES ('Coelho');
INSERT INTO tipo_animal (nome) VALUES ('Chinchila');
INSERT INTO tipo_animal (nome) VALUES ('Tartaruga');
INSERT INTO tipo_animal (nome) VALUES ('Ferret');
INSERT INTO tipo_animal (nome) VALUES ('Canário');
INSERT INTO tipo_animal (nome) VALUES ('Tarântula');
INSERT INTO tipo_animal (nome) VALUES ('Axolote');

-- Porte Pet
INSERT INTO porte_pet (id, descricao) VALUES (1, 'Pequeno');
INSERT INTO porte_pet (id, descricao) VALUES (2, 'Médio');
INSERT INTO porte_pet (id, descricao) VALUES (3, 'Grande');

-- Convênio
INSERT INTO convenio (cnpj, nome, email, logo) VALUES ('10864846000123', 'Petlove', 'petlove@pet.com.br', 'https://vetores.org/wp-content/uploads/pet-love.png');

-- Especialidade
INSERT INTO especialidade(nome) VALUES('Dermatologia');
INSERT INTO especialidade(nome) VALUES('Acupuntura');
INSERT INTO especialidade(nome) VALUES('Cardiologista');

-- Usuario
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('12345678911', 'Ricardo Lucas da Silva', 'ricardo@gmail.com.br', '123', 'https://img.freepik.com/fotos-premium/feche-o-rosto-retrato-medico-homem-idoso-medico-especialista-clinico-geral-trabalho-em_717737-2660.jpg');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('78945612332', 'Alberto Campos', 'alberto@gmail.com.br', '456', 'https://www.shopveterinario.com.br/blog/wp-content/uploads/2019/11/medico-veterinario-bem-sucedido-artigo.jpg');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('15948723159', 'Lucas dos Santos', 'lucas@yahoo.com.br', '789', 'https://img.freepik.com/fotos-premium/meu-melhor-paciente-veterinario-masculino-alegre-em-uniforme-de-trabalho-segurando-um-cachorro-e-sorrindo-em-pe-na-clinica-veterinaria_255667-36109.jpg');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('11122233344', 'João Silva', 'joao.silva@gmail.com', 'senha123', 'https://jornaldoburitis.com.br/fotos/capa_7621c7c4a59-b215-4e63-a152-fe9d98b6b0d2.jpg');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('22233344455', 'Maria Oliveira', 'maria.oliveira@gmail.com', 'outrasenha456', 'https://www.qualittas.com.br/blog/wp-content/uploads/2017/03/Vet-And-Cat.jpg');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('33344455566', 'Leonardo Santos', 'leonardo.santos@gmail.com', 'senha789', 'https://uploads.metropoles.com/wp-content/uploads/2023/10/16193707/medico-veterinario.jpg');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('44455566677', 'Yasmim Souza', 'yasmim.souza@gmail.com', 'senha456', 'https://caesegatos.com.br/wp-content/uploads/2020/11/mulher-1.jpg');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('55566677788', 'Luiz Costa', 'luiz.costa@gmail.com', 'senha987', 'https://thumbs.dreamstime.com/z/veterin%C3%A1rio-do-homem-com-um-gato-83157615.jpg');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('66677788899', 'Camila Lima', 'camila.lima@gmail.com', 'senha321', 'https://caesegatos.com.br/wp-content/uploads/2022/03/mulheres-1024x664.png');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('77788899900', 'Fernando Pereira', 'fernando.pereira@gmail.com', 'senha654', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQH3CPQLJ_BVziA4UmIZze3hmobWWLH2nUuOA&usqp=CAU');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('88899900011', 'Julia Santos', 'julia.santos@gmail.com', 'senha012', 'https://portalt5-cdn1.cworks.cloud/fileadmin/_processed_/c/d/csm_mulher-veterinaria_ee374354db.jpg');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('99900011122', 'Rafael Oliveira', 'rafael.oliveira@gmail.com', 'senha345', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT690GCX-cp1lk-N4YmtTBgnaXwPyuuGwlSSw&usqp=CAU');
INSERT INTO usuario(cpf, nome, email, senha, foto) VALUES ('12323434556', 'Ana Costa', 'ana.costa@gmail.com', 'senha678', 'https://cdn.shortpixel.ai/spai/q_glossy+ret_img+to_auto/eteit.univale.br/wp-content/uploads/2022/01/curso-tecnico-veterinaria-imagem-mulher-cuidando-de-cachorro-scaled.jpg');
INSERT INTO usuario (nome, cpf, email, senha) VALUES 
  ('João Silva', '12345678901', 'joao.silva@example.com', 'senha123'),
  ('Maria Oliveira', '98765432109', 'maria.oliveira@example.com', 'senha456'),
  ('Carlos Santos', '11122233344', 'carlos.santos@example.com', 'senha789'),
  ('Ana Pereira', '55566677788', 'ana.pereira@example.com', 'senhaabc'),
  ('Pedro Souza', '99988877766', 'pedro.souza@example.com', 'senhadef');



-- Veterinário
INSERT INTO veterinario(id, crmv, descricao) VALUES(1, '65465462', 'Sou um veterinário comprometido e apaixonado pela saúde e bem-estar dos animais, dedicado a oferecer cuidados excepcionais e promover uma vida saudável para os nossos companheiros de quatro patas.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(2, '78978978', 'Com vasta experiência em medicina veterinária, estou empenhado em proporcionar o melhor atendimento para animais de estimação, buscando sempre inovações e tratamentos eficazes.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(3, '45645645', 'Meu compromisso é garantir o conforto e a saúde dos animais sob meus cuidados. Utilizo abordagens holísticas e práticas baseadas em evidências para promover o bem-estar.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(4, '32132132', 'Veterinário dedicado a melhorar a qualidade de vida dos animais. Trabalho com paixão e profissionalismo, adotando abordagens éticas e avançadas para o tratamento veterinário.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(5, '98798798', 'Busco constantemente atualizações e avanços na medicina veterinária para oferecer o mais alto padrão de cuidado aos animais. Minha missão é proporcionar uma vida saudável e feliz para os pets.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(6, '23423423', 'Especializado em cuidados preventivos e curativos, ofereço serviços veterinários abrangentes para garantir a saúde e felicidade de seus animais de estimação.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(7, '87687687', 'Comprometido com a excelência no atendimento veterinário, sou apaixonado por trabalhar com animais e proporcionar soluções eficazes para suas necessidades de saúde.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(8, '54354354', 'Veterinário experiente e atencioso, focado em estabelecer vínculos com os proprietários e fornecer cuidados individualizados para animais de estimação de todas as idades.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(9, '21021021', 'Minha abordagem compassiva e dedicada à medicina veterinária visa garantir que seus animais recebam os melhores cuidados, promovendo uma vida longa e saudável.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(10, '99999999', 'Profissional comprometido em oferecer cuidados veterinários excepcionais, visando o bem-estar e a felicidade de seus animais de estimação. Conte comigo para todas as suas necessidades veterinárias.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(11, '11111111', 'Sou um veterinário apaixonado por animais e comprometido em fornecer cuidados de alta qualidade. Meu objetivo é garantir a saúde e a felicidade de cada paciente.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(12, '22222222', 'Com anos de experiência em medicina veterinária, ofereço serviços abrangentes para atender às necessidades individuais de cada animal. Meu foco é proporcionar uma vida saudável e plena.');
INSERT INTO veterinario(id, crmv, descricao) VALUES(13, '33333333', 'Veterinário dedicado e compassivo, comprometido em estabelecer uma relação de confiança com os tutores e fornecer o melhor atendimento possível para seus queridos animais de estimação.');

-- Veterinario Porte Pet
INSERT INTO veterinario_porte_pet(id_veterinario, id_porte_pet) VALUES(1, 1);
INSERT INTO veterinario_porte_pet(id_veterinario, id_porte_pet) VALUES(1, 2);
INSERT INTO veterinario_porte_pet(id_veterinario, id_porte_pet) VALUES(2, 3);

-- Telefone
INSERT INTO telefone(id_usuario, telefone) VALUES (1, '9-0000-0000');
INSERT INTO telefone(id_usuario, telefone) VALUES (1, '9-1111-1111');
INSERT INTO telefone(id_usuario, telefone) VALUES (2, '9-2222-2222');
INSERT INTO telefone(id_usuario, telefone) VALUES (2, '9-2134-2542');
INSERT INTO telefone(id_usuario, telefone) VALUES (3, '9-3333-3333');
INSERT INTO telefone(id_usuario, telefone) VALUES (3, '9-4444-4444');
INSERT INTO telefone(id_usuario, telefone) VALUES (4, '9-5555-5555');
INSERT INTO telefone(id_usuario, telefone) VALUES (4, '9-6666-6666');
INSERT INTO telefone(id_usuario, telefone) VALUES (5, '9-7777-7777');
INSERT INTO telefone(id_usuario, telefone) VALUES (5, '9-8888-8888');
INSERT INTO telefone(id_usuario, telefone) VALUES (6, '9-9999-9999');
INSERT INTO telefone(id_usuario, telefone) VALUES (6, '9-0000-0001');
INSERT INTO telefone(id_usuario, telefone) VALUES (7, '9-1111-1112');
INSERT INTO telefone(id_usuario, telefone) VALUES (7, '9-2222-2223');
INSERT INTO telefone(id_usuario, telefone) VALUES (8, '9-3333-3334');
INSERT INTO telefone(id_usuario, telefone) VALUES (8, '9-4444-4445');
INSERT INTO telefone(id_usuario, telefone) VALUES (9, '9-5555-5556');
INSERT INTO telefone(id_usuario, telefone) VALUES (9, '9-6666-6667');
INSERT INTO telefone(id_usuario, telefone) VALUES (10, '9-7777-7778');
INSERT INTO telefone(id_usuario, telefone) VALUES (10, '9-8888-8889');
INSERT INTO telefone(id_usuario, telefone) VALUES (11, '9-9999-9990');
INSERT INTO telefone(id_usuario, telefone) VALUES (11, '9-0000-0002');
INSERT INTO telefone(id_usuario, telefone) VALUES (12, '9-1111-1113');
INSERT INTO telefone(id_usuario, telefone) VALUES (12, '9-2222-2224');
INSERT INTO telefone(id_usuario, telefone) VALUES (13, '9-3333-3335');
INSERT INTO telefone(id_usuario, telefone) VALUES (13, '9-4444-4446');

-- Veterinario Especialidade
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(1, 1);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(2, 3);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(3, 3);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(4, 2);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(5, 1);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(6, 3);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(7, 2);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(8, 3);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(9, 2);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(10,1);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(11,2);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(12,1);
INSERT INTO veterinario_especialidade(id_veterinario, id_especialidade) VALUES(13,1);

-- Veterinario Tipo Animal
INSERT INTO veterinario_tipo_animal (id_veterinario, id_tipo_animal) VALUES (1, 2);
INSERT INTO veterinario_tipo_animal (id_veterinario, id_tipo_animal) VALUES (1, 3);
INSERT INTO veterinario_tipo_animal (id_veterinario, id_tipo_animal) VALUES (1, 1);
INSERT INTO veterinario_tipo_animal (id_veterinario, id_tipo_animal) VALUES (2, 4);
INSERT INTO veterinario_tipo_animal (id_veterinario, id_tipo_animal) VALUES (3, 1);
INSERT INTO veterinario_tipo_animal (id_veterinario, id_tipo_animal) VALUES (4, 2);
INSERT INTO veterinario_tipo_animal (id_veterinario, id_tipo_animal) VALUES (5, 3);
INSERT INTO veterinario_tipo_animal (id_veterinario, id_tipo_animal) VALUES (6, 9);
INSERT INTO veterinario_tipo_animal (id_veterinario, id_tipo_animal) VALUES (7, 10);

-- Veterinario Convenio
INSERT INTO veterinario_convenio (id_veterinario, id_convenio) VALUES (1, 1);
INSERT INTO veterinario_convenio (id_veterinario, id_convenio) VALUES (5, 1);
INSERT INTO veterinario_convenio (id_veterinario, id_convenio) VALUES (8, 1);
INSERT INTO veterinario_convenio (id_veterinario, id_convenio) VALUES (9, 1);

-- Dono Pet
INSERT INTO dono_pet(id) VALUES (14);
INSERT INTO dono_pet(id) VALUES (15);
INSERT INTO dono_pet(id) VALUES (16);
INSERT INTO dono_pet(id) VALUES (17);
INSERT INTO dono_pet(id) VALUES (18);

-- Pet
INSERT INTO pet (nome, raca, sexo, id_porte, castracao, peso, idade, foto, id_dono_pet, id_tipo_animal) VALUES ('Rex', 'Golden Retriever', 'M', 1, true, 30.5, 2, '', 14, 1);
INSERT INTO pet (nome, raca, sexo, id_porte, castracao, peso, idade, foto, id_dono_pet, id_tipo_animal) VALUES ('Mia', 'Siamese', 'F', 2, true, 5.2, 3, '', 15, 1);
INSERT INTO pet (nome, raca, sexo, id_porte, castracao, peso, idade, foto, id_dono_pet, id_tipo_animal) VALUES ('Bob', 'Labrador', 'M', 3, false, 28.0, 1, '', 16, 2);
INSERT INTO pet (nome, raca, sexo, id_porte, castracao, peso, idade, foto, id_dono_pet, id_tipo_animal) VALUES ('Luna', 'Shih Tzu', 'F', 1, true, 6.8, 4, '', 17, 2);
INSERT INTO pet (nome, raca, sexo, id_porte, castracao, peso, idade, foto, id_dono_pet, id_tipo_animal) VALUES ('Tom', 'Persian', 'M', 2, false, 4.5, 1, '', 18, 3);

-- Endereco Veterinario
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('65061600', 'Rua Dez', 15, 'Apto 101', 'Bequimão', 'PetVida Clinic', 21, 1);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('69022370', 'Travessa Tracuá II', 43, 'Bloco A', 'TarumãAçu', 'Animalia Saúde Vet', 13, 2);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('78130445', 'Rua General Nelson de Mello', 6, 'Casa 3', 'Ikaray', 'Vida Animal Clínica', 22, 3);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('29149460', 'Avenida Vila Velha', 2, 'Sala 202', 'Nova Brasília', 'Pata & Pelagem', 32, 4);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('79300080', 'Rua Colombo', 6, 'Fundos', 'Centro', 'Amigo Fiel Vet', 50, 5);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('12929031', 'Rua Ipê Amarelo', 1, 'Lote 15', 'Residencial dos Ipês I', 'Cão e Gato Clinic', 35, 6);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('69315603', 'Rua Roxinol', 9, 'Edifício Prime', 'São Bento', 'VetCenter Brasil', 35, 7);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('79022290', 'Rua Enoch Vieira de Almeida', 85, 'Andar 3', 'Vila Gomes', 'AniHealth Clínica', 50, 8);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('75075655', 'Rua Francisco S. Batista', 423, 'Galpão B', 'Setor Bougainville', 'Clínica PetLove', 52, 9);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('69901360', 'Rua Delfim Neto', 849, 'Condomínio Residencial', 'Conjunto Guiomard Santos', 'Saúde Animal Plus', 12, 10);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('73752402', 'Quadra M 25', 321, 'Loja 7', 'Santa Rita', 'MelhorAmigo Vet', 52, 11);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('69104003', 'Rua Benjamim Constant', 5, 'Sobrado Amarelo', 'Santa Luzia', 'ClinVet Express', 13, 12);
INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, clinica, id_cidade, id_veterinario) VALUES ('95086120', 'Rua Eraldo Bragatti', 83, 'Edifício Esmeralda', 'Cristo Redentor', 'Clinica VetPet', 43, 13);