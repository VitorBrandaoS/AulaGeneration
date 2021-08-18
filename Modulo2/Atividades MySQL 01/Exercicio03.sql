create database db_escola;
use db_escola;

create table estudantes (
	id bigint auto_increment,
    nome varchar(50) not null,
    idade int not null,
    sexo varchar(50) not null,
	nota int not null,
    estudando varchar(50) null,
    primary key(id)
);

select * from estudantes;

insert into estudantes(nome, idade, sexo, nota, estudando) values 
("Jorge", 11, "Masculino", 6, "Matemática"), 
("Bia", 12, "Feminino", 7, "Português"),
("Gabriele", 10, "Feminino", 5, "Inglês"),
("Lucas", 14, "Masculino", 3, "Português"),
("Barbara", 11, "Feminino", 6, "Matemática"), 
("Julio", 12, "Masculino", 4, "Português"),
("Rodrigo", 10, "Masculino", 5, "Português"),
("Bruno", 14, "Masculino", 9, "Geografia");

/*Puxando aluno com nota maior que 7*/
select * from estudantes where nota >= 7;
/*Puxando aluno com nota menor que 7*/
select * from estudantes where nota < 7;

/*Comando para alterar valor de um produto*/
update estudantes set nota = 8 where id = 5;


