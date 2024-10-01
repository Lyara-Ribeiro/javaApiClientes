#criando o banco de dados
CREATE DATABASE bdApiClientes;

#acessando o banco de dados
USE bdApiClientes;

#criando a tabela de clientes no banco de dados
CREATE TABLE cliente(
id CHAR(36) PRIMATY KEY,
nome VARCHAR(150) NOT NULL,
email VARCHAR(150) NOT NULL,
telefone VARCHAR(150) NOT NULL,
datacadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);

