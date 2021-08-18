create database db_ecommerce;
use db_ecommerce;

create table produtos (
	codigo bigint auto_increment,
    nome varchar(50) not null,
    tipo varchar(50) not null,
    perecivel boolean not null,
    quantidade int not null,
    valor float not null,
    primary key(codigo)
);

select * from produtos;

insert into produtos(nome, tipo, perecivel, quantidade, valor) values 
("Notebook", "Eletrônico", false, 10, 3000.00), 
("Danone", "Alimento", true, 200, 10.00),
("Pão Pulman", "Alimento", true, 100, 6.50),
("Geladeira", "Eletroelétronico", false, 20, 5000.00),
("Maquina de lavar", "Eletroelétronico", false, 20, 2000.00),
("Televisão", "Eletroelétronico", false, 10, 3500.00),
("Leite 1L", "Alimento", true, 200, 5.00),
("Placa de video", "Hardware", false, 5, 8000.00);

/*Puxando produtos com valor maior que 500*/
select * from produtos where valor > 500;
/*Puxando produtos com valor menor que 500*/
select * from produtos where valor < 500;

/*Comando para alterar valor de um produto*/
update produtos set valor = 6750 where codigo = 8;

select * from produtos;


