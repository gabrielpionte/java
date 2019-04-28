create database escola;
use escola;

create table Aluno(
	cod int primary key auto_increment, 
	nome varchar(30)
);

create table Professor(
	cod int primary key auto_increment, 
	nome varchar(30)
);
