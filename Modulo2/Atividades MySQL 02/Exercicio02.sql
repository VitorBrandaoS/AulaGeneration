create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
	id int auto_increment,
    tipo varchar(50) not null,
    tipoCoz varchar(50) not null,
    tamanho varchar(50) not null,
    primary key (id)
);

select * from tb_categoria;

create table tb_pizza(
	id int auto_increment,
    nome varchar(50) not null,
    ingred varchar(100) not null,
    peso float not null,
    cliente varchar(50) not null,
    preco float not null,
    categ_id int not null,
    primary key (id),
    foreign key (categ_id) references tb_categoria (id)
);

select * from tb_pizza;

/*Exercicio abaixo*/

insert into tb_categoria (tipo, tipoCoz, tamanho) values 
("Salgado", "Forno a lenha", "Tradicional"),
("Salgado", "Forno a lenha", "Pequeno"),
("Salgado", "Forno a gás", "Tradicional"),
("Salgado", "Forno a gás", "Pequeno"),
("Doce", "Forno a lenha", "Tradicional"),
("Doce", "Forno a lenha", "Pequeno"),
("Doce", "Forno a gás", "Tradicional"),
("Doce", "Forno a gás", "Pequeno");

insert into tb_pizza (pizza_id, nome, ingred, peso, cliente, preco) values
(1,"Portuguesa", "Presunto, cebola roxa, ovo, ervilha, azeitonas e Catupiry", 1.2, "Jorge", 50),
(2,"Calabresa", "Calabresa, cebola e azeitona", 0.8, "Maria", 25),
(4,"Peperori", "Mussarella, peperoni da Sadia e catupiry", 1, "Bia", 30),
(3,"Quatro Queijos", "Catupiry, gorgonzola, provolone e parmesão", 0.8, "João", 23),
(1,"Vegana", "Berinjela italiana, tomate em cubos e cebelo roxa", 1, "Deborah", 35),
(5,"Banana com Canela", "Banana com Canela", 0.8, "Rodrigo", 40),
(8,"Chocolate com Morango", "Chocolate com Morango", 0.8, "Mariana", 23.90),
(1,"Frango com Catupiry", "Frango desfiado e catupiry", 1.1, "Caio", 46);

select * from tb_pizza where preco > 45;

select * from tb_pizza where preco > 29 and preco < 60;

select * from tb_pizza where nome like "%c%";

select * from tb_pizza as p inner join tb_categoria as c where p.categ_id = c.id order by p.id;

select * from tb_pizza as p inner join tb_categoria as c where p.categ_id = c.id and c.tipo = "Salgado" order by p.id;