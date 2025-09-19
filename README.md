# registro-ocorrencia-java-application

# Ruan Nunes Gaspar - RM 559567

## Projeto: Registro de Ocorrências

### Descrição
Este é um sistema desenvolvido em **Java com Spring Boot** para gerenciamento de ocorrências policiais. O projeto utiliza **Spring Data JPA** para persistência em banco de dados e possui suporte a **H2 (banco em memória)** para testes. Ele permite cadastrar, consultar e gerenciar ocorrências, noticiantes, terceiros, agentes responsáveis e delegacias.

---

## Base URL
http://localhost:8080/api

## 1. Agentes Responsáveis

### Listar todos os agentes
- **GET** `/agentes`
- **Resposta:** Lista de agentes

### Buscar agente por ID
- **GET** `/agentes/{id}`
- **Parâmetros:**  
  - `id` (UUID) – ID do agente
- **Resposta:** Objeto `AgenteResponsavel` ou 404 se não encontrado

### Cadastrar novo agente
- **POST** `/agentes`
- **Body (JSON):**
```json
{
  "nome_completo": "Nome do Agente",
  "cargo": "Cargo do Agente"
}
Resposta: Objeto AgenteResponsavel criado

Atualizar agente
PUT /agentes/{id}

Parâmetros:

id (UUID) – ID do agente

{
  "nome_completo": "Novo Nome",
  "cargo": "Novo Cargo"
}
Resposta: Objeto atualizado ou 404 se não encontrado

Excluir agente
DELETE /agentes/{id}

Parâmetros:

id (UUID) – ID do agente

Resposta: 204 No Content ou 404 se não encontrado

2. Delegacias
Listar todas as delegacias
GET /delegacias

Resposta: Lista de delegacias

Buscar delegacia por ID
GET /delegacias/{id}

Parâmetros: id (UUID)

Resposta: Objeto Delegacia ou 404

Cadastrar nova delegacia
POST /delegacias

{
  "titulo": "Delegacia Central",
  "delegado_responsavel": "Nome do Delegado",
  "endereco": "Endereço",
  "telefone": "Telefone"
}
Resposta: Objeto Delegacia criado

Atualizar delegacia
PUT /delegacias/{id}

Parâmetros: id (UUID)

Body (JSON): mesmo formato do POST

Resposta: Objeto atualizado ou 404

Excluir delegacia
DELETE /delegacias/{id}

Parâmetros: id (UUID)

Resposta: 204 No Content ou 404

3. Noticiantes
Listar todos os noticiantes
GET /noticiantes

Resposta: Lista de noticiantes

Buscar noticiante por ID
GET /noticiantes/{id}

Parâmetros: id (UUID)

Resposta: Objeto Noticiante ou 404

Cadastrar noticiante
POST /noticiantes

{
  "nome_completo": "Nome",
  "cpf": "000.000.000-00",
  "rg": "00.000.000-0",
  "idade": 30,
  "estado_civil": "Solteiro",
  "telefone": "123456789",
  "email": "email@exemplo.com",
  "endereco": "Rua X, 123"
}
Resposta: Objeto Noticiante criado

Atualizar noticiante
PUT /noticiantes/{id}

Parâmetros: id (UUID)

Body (JSON): mesmo formato do POST

Resposta: Objeto atualizado ou 404

Excluir noticiante
DELETE /noticiantes/{id}

Parâmetros: id (UUID)

Resposta: 204 No Content ou 404

4. Ocorrências
Listar todas as ocorrências
GET /ocorrencias

Resposta: Lista de ocorrências

Buscar ocorrência por ID
GET /ocorrencias/{id}

Parâmetros: id (UUID)

Resposta: Objeto Ocorrencia ou 404

Cadastrar ocorrência
POST /ocorrencias

{
  "codigo_ocorrencia": 123,
  "numero_ocorrencia": 456,
  "status_concluido": false,
  "data_registro": "2025-09-19T10:00:00",
  "categoria": "Roubo",
  "descricao": "Descrição da ocorrência",
  "local_ocorrencia": "Endereço",
  "titulo": "Ocorrência X"
}
Resposta: Objeto Ocorrencia criado

Atualizar ocorrência
PUT /ocorrencias/{id}

Parâmetros: id (UUID)

Body (JSON): mesmo formato do POST

Resposta: Objeto atualizado ou 404

Excluir ocorrência
DELETE /ocorrencias/{id}

Parâmetros: id (UUID)

Resposta: 204 No Content ou 404

5. Terceiros
Buscar terceiro por ID
GET /terceiros/{id}

Parâmetros: id (UUID)

Resposta: Objeto Terceiros ou 404

Cadastrar terceiro
POST /terceiros

{
  "nome_completo": "Nome",
  "cpf": "000.000.000-00",
  "rg": "00.000.000-0",
  "idade": 25,
  "telefone": "123456789",
  "endereco": "Rua X, 123"
}
Resposta: Objeto Terceiros criado

Atualizar terceiro
PUT /terceiros/{id}

Parâmetros: id (UUID)

Body (JSON): mesmo formato do POST

Resposta: Objeto atualizado ou 404

Excluir terceiro
DELETE /terceiros/{id}

Parâmetros: id (UUID)

Resposta: 204 No Content ou 404
