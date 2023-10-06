use db_biblioteca;

create table livro(
livroId int(11) primary key auto_increment not null,
titulo varchar(50) not null,
autor varchar(50) not null,
dataCadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
secaoId int,
subsecaoId int,
constraint subchave foreign key (subsecaoId) references subsecoes(subsecoesId),
constraint chave foreign key (secaoId) references secoes(secaoId)
);

create table usuario(
usuarioId int(11) primary key auto_increment not null,
nome varchar(50) not null,
cpf varchar(50) not null,
livroNome varchar(50)
);

CREATE TABLE secoes (
secaoId INT AUTO_INCREMENT PRIMARY KEY,
secao VARCHAR(50)
);

create table subsecoes(
subsecoesId  INT AUTO_INCREMENT PRIMARY KEY,
subsecao varchar(50)
);


