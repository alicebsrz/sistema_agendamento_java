# 💗 Sistema de Agendamento - Java + Spring Boot

Meu primeiro projeto utilizando Java com Spring Boot — desenvolvido com foco em boas práticas, arquitetura limpa e integração completa entre backend e frontend.

##  Sobre o Projeto

Este projeto é uma aplicação web completa de agendamento, onde é possível criar, visualizar e remover agendamentos de forma dinâmica.

Mais do que um CRUD, o sistema foi desenvolvido simulando regras reais de negócio, como:
* Bloqueio de horários duplicados
* Validação de dados (ex: datas no passado)
* Comunicação eficiente entre frontend e backend
  
O objetivo foi ir além do básico e construir algo com estrutura próxima de um sistema real de produção.

## 🧩 Stack Utilizada

### 🔧 Backend
* Java 17/21
* Spring Boot 3+
* Spring Web
* Spring Data JPA / Hibernate
* H2 Database (em memória)
* Spring Validation
* Maven

### 🎨 Frontend
* HTML5
* CSS3 (Flexbox + responsividade)
* JavaScript (ES6+ com Fetch API)

### 🛠️ Ferramentas
* VS Code
* Thunder Client

## 🧠 Conceitos Aplicados

* Arquitetura em camadas (Controller, Service, Repository)
* Construção de API RESTful
* Uso correto de HTTP Methods e Status Codes
* Implementação de CRUD completo
* Uso de DTO (Data Transfer Object)
* Validação de dados com Spring Validation
* Tratamento de CORS
* Integração entre frontend e backend com requisições assíncronas

## ⚙️ Funcionalidades

✔️ Criar agendamentos
✔️ Listar agendamentos em tempo real
✔️ Deletar agendamentos
✔️ Impedir conflitos de horário
✔️ Validação de dados antes do envio

## 🛤️ Como Executar o Projeto

### 🔙 Backend

Abra o terminal, navegue até a pasta do backend e execute os comandos:

```bash
cd backend
mvn install
mvn spring-boot:run
```
### 🌐 Frontend 

```bash
cd frontend
```

Abra o arquivo index.html no navegador ou utilize uma extensão como Live Server no VS Code. 

### 💡 Diferenciais do Projeto
💗 Implementação de regras de negócio reais

💗 Código organizado seguindo boas práticas

💗 Separação clara de responsabilidades

💗 Integração completa frontend + backend

💗 Projeto pensado como base para evolução futura.

### Sobre mim
Desenvolvido por Alice Barbosa 💗
Estudante de Engenharia da Computação e apaixonada por desenvolvimento de software.
