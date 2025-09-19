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

# Código para importação do Postman:
'''	
info	
name	"Registro Ocorrência API - Teste Direto"
_postman_id	"abcdef12-3456-7890-abcd-ef1234567890"
description	"Coleção para testar todos os endpoints CRUD do projeto Registro de Ocorrência com IDs e datas preenchidos"
schema	"https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
item	
0	
name	"AgenteResponsavel"
item	
0	
name	"Listar Todos"
request	
method	"GET"
url	"http://localhost:8080/api/agentes"
1	
name	"Buscar por ID"
request	
method	"GET"
url	"http://localhost:8080/api/agentes/11111111-1111-1111-1111-111111111111"
2	
name	"Cadastrar"
request	
method	"POST"
header	
0	
key	"Content-Type"
value	"application/json"
body	
mode	"raw"
raw	'{\n  "nomeCompleto": "João da Silva",\n  "cargo": "Delegado"\n}'
url	"http://localhost:8080/api/agentes"
3	
name	"Atualizar"
request	
method	"PUT"
header	
0	
key	"Content-Type"
value	"application/json"
body	
mode	"raw"
raw	'{\n  "nomeCompleto": "João da Silva Updated",\n  "cargo": "Delegado Chefe"\n}'
url	"http://localhost:8080/api/agentes/11111111-1111-1111-1111-111111111111"
4	
name	"Excluir"
request	
method	"DELETE"
url	"http://localhost:8080/api/agentes/11111111-1111-1111-1111-111111111111"
1	
name	"Delegacia"
item	
0	
name	"Listar Todas"
request	
method	"GET"
url	"http://localhost:8080/api/delegacias"
1	
name	"Buscar por ID"
request	
method	"GET"
url	"http://localhost:8080/api/delegacias/22222222-2222-2222-2222-222222222222"
2	
name	"Cadastrar"
request	
method	"POST"
header	
0	
key	"Content-Type"
value	"application/json"
body	
mode	"raw"
raw	'{\n  "titulo": "Delegacia Central",\n  "delegadoResponsavel": "Maria Souza",\n  "endereco": "Rua Central, 100",\n  "telefone": "11999999999"\n}'
url	"http://localhost:8080/api/delegacias"
3	
name	"Atualizar"
request	
method	"PUT"
header	
0	
key	"Content-Type"
value	"application/json"
body	
mode	"raw"
raw	'{\n  "titulo": "Delegacia Central Atualizada",\n  "delegadoResponsavel": "Maria Souza Silva",\n  "endereco": "Rua Central, 101",\n  "telefone": "11988888888"\n}'
url	"http://localhost:8080/api/delegacias/22222222-2222-2222-2222-222222222222"
4	
name	"Excluir"
request	
method	"DELETE"
url	"http://localhost:8080/api/delegacias/22222222-2222-2222-2222-222222222222"
2	
name	"Noticiante"
item	
0	
name	"Listar Todos"
request	
method	"GET"
url	"http://localhost:8080/api/noticiantes"
1	
name	"Buscar por ID"
request	
method	"GET"
url	"http://localhost:8080/api/noticiantes/33333333-3333-3333-3333-333333333333"
2	
name	"Cadastrar"
request	
method	"POST"
header	
0	
key	"Content-Type"
value	"application/json"
body	
mode	"raw"
raw	'{\n  "nomeCompleto": "Carlos Pereira",\n  "cpf": "12345678900",\n  "rg": "MG123456",\n  "idade": 35,\n  "email": "carlos@example.com",\n  "telefone": "11977777777",\n  "endereco": "Av. Brasil, 200",\n  "estadoCivil": "Solteiro"\n}'
url	"http://localhost:8080/api/noticiantes"
3	
name	"Atualizar"
request	
method	"PUT"
header	
0	
key	"Content-Type"
value	"application/json"
body	
mode	"raw"
raw	'{\n  "nomeCompleto": "Carlos Pereira Jr.",\n  "cpf": "12345678900",\n  "rg": "MG123456",\n  "idade": 36,\n  "email": "carlosjr@example.com",\n  "telefone": "11977777778",\n  "endereco": "Av. Brasil, 201",\n  "estadoCivil": "Casado"\n}'
url	"http://localhost:8080/api/noticiantes/33333333-3333-3333-3333-333333333333"
4	
name	"Excluir"
request	
method	"DELETE"
url	"http://localhost:8080/api/noticiantes/33333333-3333-3333-3333-333333333333"
3	
name	"Ocorrencia"
item	
0	
name	"Listar Todas"
request	
method	"GET"
url	"http://localhost:8080/api/ocorrencias"
1	
name	"Buscar por ID"
request	
method	"GET"
url	"http://localhost:8080/api/ocorrencias/44444444-4444-4444-4444-444444444444"
2	
name	"Cadastrar"
request	
method	"POST"
header	
0	
key	"Content-Type"
value	"application/json"
body	
mode	"raw"
raw	'{\n  "titulo": "Roubo em loja",\n  "descricao": "Furtaram eletrônicos",\n  "categoria": "Roubo",\n  "numeroOcorrencia": 101,\n  "codigoOcorrencia": 1001,\n  "localOcorrencia": "Rua A, 50",\n  "statusConcluido": false,\n  "dataRegistro": "2025-09-19T10:00:00"\n}'
url	"http://localhost:8080/api/ocorrencias"
3	
name	"Atualizar"
request	
method	"PUT"
header	
0	
key	"Content-Type"
value	"application/json"
body	
mode	"raw"
raw	'{\n  "titulo": "Roubo em loja atualizado",\n  "descricao": "Furtaram eletrônicos e dinheiro",\n  "categoria": "Roubo",\n  "numeroOcorrencia": 101,\n  "codigoOcorrencia": 1001,\n  "localOcorrencia": "Rua A, 50",\n  "statusConcluido": true,\n  "dataRegistro": "2025-09-19T10:30:00"\n}'
url	"http://localhost:8080/api/ocorrencias/44444444-4444-4444-4444-444444444444"
4	
name	"Excluir"
request	
method	"DELETE"
url	"http://localhost:8080/api/ocorrencias/44444444-4444-4444-4444-444444444444"
4	
name	"Terceiros"
item	
0	
name	"Buscar por ID"
request	
method	"GET"
url	"http://localhost:8080/api/terceiros/55555555-5555-5555-5555-555555555555"
1	
name	"Cadastrar"
request	
method	"POST"
header	
0	
key	"Content-Type"
value	"application/json"
body	
mode	"raw"
raw	'{\n  "nomeCompleto": "Ana Rodrigues",\n  "cpf": "98765432100",\n  "rg": "SP987654",\n  "idade": 28,\n  "telefone": "11966666666",\n  "endereco": "Rua B, 300"\n}'
url	"http://localhost:8080/api/terceiros"
2	
name	"Atualizar"
request	
method	"PUT"
header	
0	
key	"Content-Type"
value	"application/json"
body	
mode	"raw"
raw	'{\n  "nomeCompleto": "Ana Rodrigues Silva",\n  "cpf": "98765432100",\n  "rg": "SP987654",\n  "idade": 29,\n  "telefone": "11966666667",\n  "endereco": "Rua B, 301"\n}'
url	"http://localhost:8080/api/terceiros/55555555-5555-5555-5555-555555555555"
3	
name	"Excluir"
request	
method	"DELETE"
url	"http://localhost:8080/api/terceiros/55555555-5555-5555-5555-555555555555"
'''
