create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
	id int primary key auto_increment,
    nome varchar(50) not null,
    ataque int not null,
    defesa int not null,
	mana int not null
);

select * from tb_classe;

create table tb_personagem(
	id int auto_increment,
    nome varchar(50) not null,
    lv int not null,
    xp int not null,
    vida int not null,
    classe_id int not null,
    primary key (id),
    foreign key (classe_id) references tb_classe (id)
);

select * from tb_personagem;

/*Exercicio abaixo*/

insert into tb_classe (nome, ataque, defesa, mana) values 
("Mago", 5000, 500, 100),
("Guerreiro", 2500, 3000, 0),
("Ladrão", 1500, 1050, 0),
("Paladino", 3000, 1900, 80),
("Arqueiro", 1800, 800, 0);

insert into tb_personagem (nome, lv, xp, vida, classe_id) values
("Juberildo", 10, 1000, 85, 5),
("Atlas", 52, 5200, 300, 2),
("Artemis", 34, 3400, 200, 1),
("Azoth", 80, 8000, 400, 4),
("Halamud", 1, 100, 50, 3),
("Buiuia", 74, 7400, 600, 2),
("Patches", 30, 3000, 125, 3),
("Dayane", 100, 10000, 600, 1);

select * from tb_personagem inner join tb_classe where tb_personagem.id = tb_classe.id and tb_classe.ataque > 2000;

select * from tb_personagem inner join tb_classe where tb_personagem.id = tb_classe.id and tb_classe.defesa > 1000 and tb_classe.defesa < 2000;

select * from tb_personagem where tb_personagem.nome like "%c%";

select * from tb_personagem as per inner join tb_classe as class where per.classe_id = class.id  order by per.id;

select * from tb_personagem  inner join tb_classe where tb_personagem.classe_id = 2 and tb_classe.nome = "Guerreiro";