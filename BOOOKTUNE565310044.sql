create database bd_tune;
use bd_tune;

CREATE TABLE clientes (
    id_clientes INT(55) PRIMARY KEY auto_increment not null,
    nome_cliente VARCHAR(100) not null,
    cpf VARCHAR(100) not null,
    email VARCHAR(100) not null,
    telefone VARCHAR(100) not null
);

INSERT INTO clientes (nome_cliente, email, cpf, telefone) VALUES
    ('João da Silva', 'joao.silva@example.com', '12345678900', '(11) 9876-5432'),
    ('Maria Santos', 'maria.santos@example.com', '98765432100', '(21) 5555-1234'),
    ('Carlos Oliveira', 'carlos.oliveira@example.com', '11122233344', '(31) 8765-4321'),
    ('Ana Pereira', 'ana.pereira@example.com', '44455566677', '(41) 2345-6789'),
    ('Rafael Sousa', 'rafael.sousa@example.com', '88899900011', '(51) 7654-3210'),
    ('Carla Costa', 'carla.costa@example.com', '22233344455', '(61) 3333-2222'),
    ('Luís Fernandes', 'luis.fernandes@example.com', '55566677788', '(71) 4444-3333'),
    ('Mariana Rodrigues', 'mariana.rodrigues@example.com', '77788899900', '(81) 9876-5432'),
    ('Gustavo Alves', 'gustavo.alves@example.com', '33344455566', '(91) 1234-5678'),
    ('Isabel Martins', 'isabel.martins@example.com', '66677788899', '(01) 8765-4321');



CREATE TABLE emprestimo (
    id_emprestimo INT(55) primary key auto_increment not null,
    data_emprestimo date not null,
    prazo_emprestimo date not null,
    titulo VARCHAR(100) not null,
     cpf VARCHAR(100) not null   
);


INSERT INTO  emprestimo (data_emprestimo, prazo_emprestimo, titulo, cpf)
VALUES ('2023-09-28', '23-10-28', 'Batida Quente', '294854859-98');



CREATE TABLE livro (
    id_livro INT(55) PRIMARY KEY auto_increment not null,
    titulo VARCHAR(100) not null,
    autor VARCHAR(100) not null,
    genero VARCHAR(100) not null,
    secao VARCHAR(100) not null,
    subsecao VARCHAR(100) not null
);

CREATE TABLE AUTENTICACAO(
id_autenticacao INT(55) primary key auto_increment not null,
login VARCHAR(100) not null,
senha VARCHAR(100) not null
);

INSERT INTO AUTENTICACAO (login,senha)
VALUES ('msilva', 'm1234');


INSERT INTO livro (titulo, autor, genero, secao,subsecao)
VALUES ('Funk na Cidade', 'Maria da Silva', 'Funk','musicas','F');


INSERT INTO livro (titulo, autor, genero,secao,subsecao)
VALUES ('Batida Quente', 'José Santos', 'Funk','musicas','F');

INSERT INTO livro (titulo, autor, genero,secao,subsecao)
VALUES ('Noites de Blues', 'João Pereira', 'Blues','musicas','F');


INSERT INTO livro (titulo, autor, genero,secao,subsecao)
VALUES ('Lamentos do Delta', 'Ana Souza', 'Blues','musicas','B');


INSERT INTO Livro (titulo, autor, genero,secao,subsecao)
VALUES
    ('História do Hip Hop', 'John Hip-Hopson', 'Hip Hop','musicas','H'),
    ('Letras e Versos: A Arte do Rap', 'Maria Rapperia', 'Hip Hop','musicas','H'),
    ('A Cultura Hip Hop: Além da Música', 'Carlos Breaker', 'Hip Hop','musicas','H'),
    ('Rap e Sociedade: Reflexões Urbanas', 'Ana MC', 'Hip Hop','musicas','H'),
    ('O Hip Hop e a Luta por Justiça', 'José Freestyler', 'Hip Hop','musicas','H');