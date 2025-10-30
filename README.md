# Registro de Ocorrências

**Aluno:** Ruan Nunes Gaspar  
**RM:** 559567  
**Turma:** 2TDSPA


**Aluno:** Rodrigo Paes Morales  
**RM:** 560209  
**Turma:** 2TDSPA


---

## 1. Apresentação do Projeto

O **Registro de Ocorrências** é uma aplicação web desenvolvida com **Spring Boot**, que permite o gerenciamento de registros policiais e informações relacionadas a **agentes**, **delegacias**, **noticiantes**, **ocorrências** e **terceiros envolvidos**.

### A aplicação disponibiliza:

- **Endpoints REST** para operações CRUD (Create, Read, Update, Delete) com **Spring Data JPA** e persistência em **banco H2 (em memória)**.
- **Console H2** para consulta direta dos dados.
- **Autenticação e autorização via JWT (JSON Web Token)**.
- **Páginas web com Thymeleaf**, incluindo menu, rodapé e layout responsivo.

---

## 2. Tecnologias Utilizadas

| Tecnologia | Descrição |
|-------------|------------|
| **Java 24** | Linguagem base para o desenvolvimento da aplicação |
| **Spring Boot 3.5.5** | Framework para criação rápida de aplicações web robustas |
| **Spring Data JPA** | Facilita a persistência e manipulação de dados via entidades e repositórios |
| **H2 Database (em memória)** | Banco leve para desenvolvimento e testes rápidos |
| **JWT (JSON Web Token)** | Implementação de autenticação e segurança da API REST |
| **Thymeleaf** | Template engine para páginas HTML dinâmicas |
| **Maven** | Gerenciador de dependências e build do projeto |
| **Swagger / Springdoc OpenAPI** | Documentação automática e interativa dos endpoints REST |
| **Postman** | Testes manuais e validação das APIs REST |

---

## 3. Endpoints da API

### 3.1 Agente Responsável

| Método | URL | Descrição | Request Body |
|--------|-----|------------|---------------|
| GET | `/api/agentes` | Lista todos os agentes | - |
| GET | `/api/agentes/{id}` | Busca agente por ID | - |
| POST | `/api/agentes` | Cadastra novo agente | `{"nomeCompleto":"", "cargo":""}` |
| PUT | `/api/agentes/{id}` | Atualiza agente existente | `{"nomeCompleto":"", "cargo":""}` |
| DELETE | `/api/agentes/{id}` | Remove agente | - |

---

### 3.2 Delegacia

| Método | URL | Descrição | Request Body |
|--------|-----|------------|---------------|
| GET | `/api/delegacias` | Lista todas as delegacias | - |
| GET | `/api/delegacias/{id}` | Busca delegacia por ID | - |
| POST | `/api/delegacias` | Cadastra nova delegacia | `{"titulo":"", "delegadoResponsavel":"", "endereco":"", "telefone":""}` |
| PUT | `/api/delegacias/{id}` | Atualiza delegacia existente | `{"titulo":"", "delegadoResponsavel":"", "endereco":"", "telefone":""}` |
| DELETE | `/api/delegacias/{id}` | Remove delegacia | - |

---

### 3.3 Noticiante

| Método | URL | Descrição | Request Body |
|--------|-----|------------|---------------|
| GET | `/api/noticiantes` | Lista todos os noticiantes | - |
| GET | `/api/noticiantes/{id}` | Busca noticiante por ID | - |
| POST | `/api/noticiantes` | Cadastra novo noticiante | `{"nomeCompleto":"", "cpf":"", "rg":"", "idade":0, "email":"", "telefone":"", "endereco":"", "estadoCivil":""}` |
| PUT | `/api/noticiantes/{id}` | Atualiza noticiante existente | Mesmo JSON do POST |
| DELETE | `/api/noticiantes/{id}` | Remove noticiante | - |

---

## 4. Funcionalidades e Tecnologias Implementadas

### 4.1 Sistema JWT (JSON Web Token)

- Implementação completa do fluxo de autenticação via JWT.
- Endpoint `/api/auth/login` para geração do token.
- **Filtro JwtFilter** intercepta requisições e valida tokens.
- **Spring Security** configurado para proteger endpoints e liberar o Swagger UI.
- Login via formulário web com integração entre **sessão HTTP** e **JWT**.

---

### 4.2 Páginas Web com Thymeleaf

- Página inicial com tema “**polícia brasileira**”.
- Menu fixo superior com navegação entre seções.
- Formulários de cadastro e edição com **CSS moderno e responsivo**.
- Mensagens de sucesso e erro claras.
- Footer fixo com identificação do sistema.
- Layout adaptável a dispositivos móveis.

---

### 4.3 API RESTful

- **Controllers** organizados por entidade principal.
- **Documentação automática** via Springdoc OpenAPI / Swagger UI.
- Uso de **DTOs** e **Entities** para código limpo e reutilizável.

---

## 5. Prints e Demonstrações

Em breve serão adicionados **prints** e **GIFs** demonstrando:

- Tela de **login com autenticação JWT**.
- **Navegação** no menu principal.
- **Listagens e formulários** de cada entidade.
- **Console H2** com dados armazenados.
- **Swagger UI** com a documentação interativa da API.

---

> *Projeto desenvolvido como parte da disciplina Java Advanced do curso de Análise e Desenvolvimento de Sistemas na FIAP.*