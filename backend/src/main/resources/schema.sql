DROP TABLE IF EXISTS telefone;
DROP TABLE IF EXISTS veterinario_convenio;
DROP TABLE IF EXISTS convenio;
DROP TABLE IF EXISTS endereco;
DROP TABLE IF EXISTS cidade;
DROP TABLE IF EXISTS estado;
DROP TABLE IF EXISTS veterinario_especialidade;
DROP TABLE IF EXISTS especialidade;
DROP TABLE IF EXISTS veterinario_tipo_animal;
DROP TABLE IF EXISTS pet;
DROP TABLE IF EXISTS tipo_animal;
DROP TABLE IF EXISTS veterinario_porte_pet;
DROP TABLE IF EXISTS porte_pet;
DROP TABLE IF EXISTS dono_pet;
DROP TABLE IF EXISTS veterinario;
DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario(
	id			serial			primary key,
	nome		varchar(255)	not null,
	cpf			varchar(11)		not null,
	email		varchar(30)		not null,
    senha       varchar(25)     not null,
	foto		text
);

CREATE TABLE telefone(
    id                  serial          primary key,
    telefone            varchar(15)     not null,
    id_usuario          integer         not null,

    constraint rel_telefone_usuario foreign key(id_usuario) references usuario
);

CREATE TABLE dono_pet
(
    id                  integer          primary key,

    constraint rel_dono_pet_usuario foreign key(id) references usuario
);

CREATE TABLE tipo_animal(
	id          serial          primary key,
    nome        varchar(20)     not null
);

CREATE TABLE porte_pet(
    id            integer         primary key,
    descricao     varchar(10)       not null
);

CREATE TABLE pet(
    id              serial          primary key,
    nome	        varchar(30)     not null,
    raca            varchar(30),
    sexo            char(1),
    id_porte        integer,
    castracao       Boolean,
    peso            float,
    idade           integer,
	foto		    text,
    id_dono_pet     integer         not null,
    id_tipo_animal  integer         not null,

    constraint rel_pet_dono   foreign key(id_dono_pet) references dono_pet(id),
    constraint rel_pet_tipo   foreign key(id_tipo_animal) references tipo_animal,
    constraint rel_pet_porte  foreign key(id_porte) references porte_pet
);

CREATE TABLE especialidade(

    id        serial          primary key,
    nome      varchar(60)     not null

);

CREATE TABLE convenio (
    id             serial          primary key,
    cnpj           varchar(14)     not null,
    nome           varchar(60)     not null,
    email          varchar(30)     not null,
    logo           text            not null
);

CREATE TABLE veterinario(
    id                  integer         primary key,
    crmv                varchar(15)     not null,
    descricao           varchar(300)    not null,

    constraint rel_veterinario_usuario foreign key(id) references usuario
);

CREATE TABLE veterinario_tipo_animal(
    id                   serial          primary key,
    id_veterinario       integer         not null,
    id_tipo_animal       integer         not null,

    constraint rel_vet_tipo_vet     foreign key(id_veterinario) references veterinario,
    constraint rel_vet_tipo_tipo     foreign key(id_tipo_animal) references tipo_animal
);

CREATE TABLE veterinario_porte_pet(
    id                      serial          primary key,
    id_veterinario          integer         not null,
    id_porte_pet            integer         not null,

    constraint rel_porte_pet_veterinrio     foreign key(id_veterinario) references veterinario,
    constraint rel_porte_pet_porte          foreign key(id_porte_pet)   references porte_pet
);

CREATE TABLE veterinario_especialidade(
    id                      serial          primary key,
    id_veterinario          integer         not null,
    id_especialidade        integer         not null,

    constraint  rel_vet_esp_veterinario     foreign key(id_veterinario) references veterinario,
    constraint  rel_vet_esp_especialidade   foreign key(id_especialidade) references especialidade
);

CREATE TABLE veterinario_convenio(
    id                          serial      primary key,
    id_veterinario              integer     not null,
    id_convenio                 integer     not null,

    constraint  rel_vet_convenio_veterinario foreign key(id_veterinario)  references veterinario,
    constraint  rel_vet_convenio_convenio foreign key(id_convenio)  references convenio
);

CREATE TABLE estado(
    id                  integer         primary key,
    nome                varchar(25)     not null,
    uf                  varchar(2)      not null
);

CREATE TABLE cidade(
    id                  serial          primary key,
    nome         varchar(60)     not null,
    id_estado           integer         not null,

    constraint rel_cidade_estado    foreign key(id_estado) references estado
);

CREATE TABLE endereco(
    id                            serial         primary key,
    cep                           varchar(8)     not null,
    logradouro                    varchar(60)    not null,
    numero                        varchar(10)    not null,
    complemento                   varchar(60)    not null,
    bairro                        varchar(60)    not null,
    clinica                       varchar(60)    not null,
    id_cidade                     integer        not null,
    id_veterinario                integer        not null,

    constraint rel_endereco_cidade          foreign key(id_cidade)  references cidade,
    constraint rel_endereco_veterinario     foreign key(id_veterinario) references veterinario
);