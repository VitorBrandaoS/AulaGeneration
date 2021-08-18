create database rh_empresa;
use rh_empresa;

create table funcionario (
	id bigint auto_increment,
    nome varchar(30) not null,
    idade int(200) not null,
    sexo varchar(20) not null,
    funsao varchar(30) not null,
    salario decimal(10,2) not null,
    primary key(id)
);

select * from funcionario;

insert into funcionario(nome, idade, sexo, funsao, salario) values 
("Vitor", 23, "Masculino", "Desenvolvedor", 8000.00), 
("Douglas", 23, "Masculino", "Desenvolvedor", 1800.00),
("Barbara", 28, "Feminino", "Desenvolvedora", 8000.00),
("Beatriz", 22, "Feminino", "Desenvolvedora", 7000.00),
("Alyson", 24, "Masculino", "Desenvolvedor", 1500.00);

/*Puxando funcionários com salario maior que 2000*/
select * from funcionario where salario > 2000;
/*Puxando funcionários com salario menor que 2000*/
select * from funcionario where salario < 2000;

/*Comando para alterar salario de um funcionario*/
update funcionario set salario = 4000 where id = 5;
