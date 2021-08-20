drop database if exists db_cursoDaMinhaVida;

create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
	id int primary key auto_increment,
    nome varchar(50) not null,
    descrisao varchar(255) not null,
    cor varchar(20) not null
);

select * from tb_categoria;

create table tb_curso(
	id int auto_increment,
    nome varchar(50) not null,
    preco float not null,
    professor varchar(30) not null,
    desconto float default 0,
	categ_id int not null,
    primary key (id),
    foreign key (categ_id) references tb_categoria (id)
);

select * from tb_curso;

insert into tb_categoria (nome, descrisao, cor) values 
("Programação","Lógica, Python, PHP, Java, .NET, Node JS, C, Computação, Jogos, IoT e mais...", "Verde"),
("Front-End","HTML, CSS, React, Angular, JavaScript, jQuery e mais...", "Azul"),
("Data Science","Ciência de dados, BI, SQL e Banco de Dados, Excel, Machine Learning, NoSQL, Estatística e mais...", "Vermelho"),
("Mobile","React Native, Flutter, iOS e Swift, Android, Kotlin, Jogos e mais...", "Amarelo");

insert into tb_curso (nome, preco, professor, desconto, categ_id) values 
("Python", 32, "Guanabara",0, 1),
("Node JS", 58, "Luis",0, 1),
("React Native", 68, "Geandro", 5, 4),
("HTML", 15, "Guanabara",0, 2),
("JavaScript", 46, "Gustavo",0, 2),
("Banco de Dados", 28, "Joaquin",0, 3),
("Machine Learning", 78, "Leandrez", 10, 3),
("Android", 38, "Chazan",0, 4);

select * from tb_curso as c where c.preco > 50;

select * from tb_curso as c where c.preco > 3 and c.preco < 60;

select * from tb_curso as c where c.nome like "%j%";

select * from tb_curso as c inner join tb_categoria as ca where c.id = ca.id ;

select * from tb_curso as c inner join tb_categoria  as ca where c.id = ca.id and c.professor = "Guanabara";