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
    valor_emprestimo varchar(55) not null,
    prazo_emprestimo date not null,
	id_livro int(55) not null,
    titulo VARCHAR(100) not null
);



ALTER TABLE emprestimo
ADD CONSTRAINT fk_id_livro FOREIGN KEY (id_livro) REFERENCES livro(id_livro);

ALTER TABLE emprestimo
ADD CONSTRAINT fk_titulo FOREIGN KEY (titulo) REFERENCES livro(titulo);






INSERT INTO emprestimo (data_emprestimo, valor_emprestimo, prazo_emprestimo, id_livro, titulo)
VALUES ('2023-09-28', 50.00, '23-10-28', 2, 'Batida Quente');



CREATE TABLE livro (
    id_livro INT(55) PRIMARY KEY auto_increment not null,
    titulo VARCHAR(100) not null,
    autor VARCHAR(100) not null,
    genero VARCHAR(100) not null
);


INSERT INTO livro (titulo, autor, genero)
VALUES ('Funk na Cidade', 'Maria da Silva', 'Funk');


INSERT INTO livro (titulo, autor, genero)
VALUES ('Batida Quente', 'José Santos', 'Funk');

INSERT INTO livro (titulo, autor, genero)
VALUES ('Noites de Blues', 'João Pereira', 'Blues');


INSERT INTO livro (titulo, autor, genero)
VALUES ('Lamentos do Delta', 'Ana Souza', 'Blues');


INSERT INTO Livro (titulo, autor, genero)
VALUES
    ('História do Hip Hop', 'John Hip-Hopson', 'Hip Hop'),
    ('Letras e Versos: A Arte do Rap', 'Maria Rapperia', 'Hip Hop'),
    ('A Cultura Hip Hop: Além da Música', 'Carlos Breaker', 'Hip Hop'),
    ('Rap e Sociedade: Reflexões Urbanas', 'Ana MC', 'Hip Hop'),
    ('O Hip Hop e a Luta por Justiça', 'José Freestyler', 'Hip Hop');