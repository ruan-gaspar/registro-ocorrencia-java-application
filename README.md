# Registro de Ocorrências

**Aluno:** Ruan Nunes Gaspar  
**RM:** 559567
**TURMA:** 2TDSPA

---

## 1. Apresentação do Projeto

O projeto **Registro de Ocorrências** é uma aplicação web desenvolvida em **Spring Boot** que permite o gerenciamento de registros policiais e informações relacionadas a agentes, delegacias, noticiantes, ocorrências e terceiros envolvidos.  

A aplicação utiliza **Spring Data JPA** para persistência em banco de dados **H2** (em memória) e disponibiliza endpoints REST para operações CRUD (Create, Read, Update, Delete). Além disso, fornece um console H2 para consulta direta dos dados.

---

## 2. Tecnologias Utilizadas

- Java 24
- Spring Boot 3.5.5
- Spring Data JPA
- H2 Database
- Maven
- REST API
- Postman (para testes)

---

## 3. Endpoints da API

### 3.1 Agente Responsável

| Método | URL | Descrição | Request Body |
|--------|-----|-----------|--------------|
| GET | `/api/agentes` | Lista todos os agentes | - |
| GET | `/api/agentes/{id}` | Busca agente por ID | - |
| POST | `/api/agentes` | Cadastra novo agente | JSON: `{"nomeCompleto":"", "cargo":""}` |
| PUT | `/api/agentes/{id}` | Atualiza agente existente | JSON: `{"nomeCompleto":"", "cargo":""}` |
| DELETE | `/api/agentes/{id}` | Remove agente | - |

---

### 3.2 Delegacia

| Método | URL | Descrição | Request Body |
|--------|-----|-----------|--------------|
| GET | `/api/delegacias` | Lista todas as delegacias | - |
| GET | `/api/delegacias/{id}` | Busca delegacia por ID | - |
| POST | `/api/delegacias` | Cadastra nova delegacia | JSON: `{"titulo":"", "delegadoResponsavel":"", "endereco":"", "telefone":""}` |
| PUT | `/api/delegacias/{id}` | Atualiza delegacia existente | JSON: `{"titulo":"", "delegadoResponsavel":"", "endereco":"", "telefone":""}` |
| DELETE | `/api/delegacias/{id}` | Remove delegacia | - |

---

### 3.3 Noticiante

| Método | URL | Descrição | Request Body |
|--------|-----|-----------|--------------|
| GET | `/api/noticiantes` | Lista todos os noticiantes | - |
| GET | `/api/noticiantes/{id}` | Busca noticiante por ID | - |
| POST | `/api/noticiantes` | Cadastra novo noticiante | JSON: `{"nomeCompleto":"", "cpf":"", "rg":"", "idade":0, "email":"", "telefone":"", "endereco":"", "estadoCivil":""}` |
| PUT | `/api/noticiantes/{id}` | Atualiza noticiante existente | JSON igual ao POST |
| DELETE | `/api/noticiantes/{id}` | Remove noticiante | - |
