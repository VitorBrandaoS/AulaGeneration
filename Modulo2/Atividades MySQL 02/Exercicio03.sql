create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
	id int primary key auto_increment,
    uso varchar(50) not null,
    tipoCap varchar(50) not null,
    tipoDor varchar(50) not null
);

select * from tb_categoria;

create table tb_produto(
	id int auto_increment,
    nome varchar(50) not null,
    preco float not null,
    quant int not null,
    descontoConvenio boolean not null,
	categ_id int not null,
    primary key (id),
    foreign key (categ_id) references tb_categoria (id)
);

select * from tb_produto;

/*Exercicio abaixo*/

insert into tb_categoria (uso, tipoCap, tipoDor) values 
("Adulto", "Gotas", "Dor de cabeça"),
("Adulto", "Gotas", "Dor no corpo"),
("Adulto", "Gotas", "Dor de barriga"),
("Adulto", "Comprimido", "Dor de cabeça"),
("Adulto", "Comprimido", "Dor no corpo"),
("Adulto", "Comprimido", "Dor de barriga"),
("Infantil", "Gotas", "Dor de cabeça"),
("Infantil", "Gotas", "Dor no corpo"),
("Infantil", "Gotas", "Dor de barriga"),
("Infantil", "Comprimido", "Dor de cabeça"),
("Infantil", "Comprimido", "Dor no corpo"),
("Infantil", "Comprimido", "Dor de barriga");

insert into tb_produto (nome, preco, quant, descontoConvenio, categ_id) values 
("Paracetamol", 10, 100, false, 1),
("Benegripe", 20, 200, true, 5),
("Calfactanto", 75, 160, true, 2),
("Cisplatina", 10, 100, false, 1),
("Danazol", 120, 80, false, 7),
("Eletriptana", 10, 100, false, 1),
("Fanciclovir", 38, 50, true, 4),
("Glucagon", 60, 100, false, 6);

select * from tb_produto where preco > 50;

select * from tb_produto where preco > 3 and preco < 60;

select * from tb_produto where nome like "%b%";

select * from tb_produto as p inner join tb_categoria as c where p.categ_id = c.id;

select * from tb_produto as p inner join tb_categoria as c where p.categ_id = c.id and c.tipoCap = "Comprimido";
