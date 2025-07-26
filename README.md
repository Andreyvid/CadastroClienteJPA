# Projeto Cadastro de Clientes com JPA e Hibernate

Este projeto é uma aplicação simples em Java que permite cadastrar, consultar e deletar clientes em um banco de dados MySQL utilizando **JPA (Java Persistence API)** e **Hibernate** como provedor de persistência.

## Funcionalidades

- Cadastro de clientes com **nome**, **email** e **data de nascimento**.
- Consulta de cliente por **ID**.
- Consulta de cliente por **nome (exato)**.
- Listagem de todos os clientes cadastrados.
- Exclusão de clientes por **ID**.
- Interface de menu via **console** para facilitar a interação.

## Tecnologias Utilizadas

- **Java SE**
- **JPA (Java Persistence API)**
- **Hibernate ORM**
- **Banco de dados MySQL**
- **Maven** (para gerenciamento de dependências)
- **JDBC Driver do MySQL**

## Detalhes Técnicos

- Uso de **anotações JPA** para mapear a entidade Cliente.
- Implementação de **transações** para garantir a integridade dos dados.
- Consultas **JPQL** para busca por nome e listagem geral.
- Tratamento básico de exceções e validação de entradas pelo usuário.
- Persistência usando estratégia de geração automática de ID (**GenerationType.IDENTITY**).

## Objetivo

Este projeto tem como objetivo demonstrar o domínio dos conceitos básicos de persistência em Java utilizando JPA e Hibernate, incluindo a manipulação de entidades, transações, consultas e operações **CRUD** em um banco de dados relacional.
