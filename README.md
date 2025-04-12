# 📋 TaskManager

Aplicação de gerenciamento de tarefas desenvolvida com **Spring Boot** e **PostgreSQL**. Permite cadastrar, visualizar, atualizar e deletar tarefas com informações como nome do responsável, descrição, status, data de criação e atualização.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Postman (para testes de API)

---

## ⚙️ Como executar o projeto

### Pré-requisitos

- Java 17 ou superior
- PostgreSQL instalado e em execução
- Git
- Postman (opcional, para testar a API)

### 1. Clone o repositório

git clone https://github.com/FelipeTardivo/gerenciador-tarefas.git

cd taskmanager

### 2. Configure o banco de dados
Acesse o arquivo src/main/resources/application.properties e ajuste para seu ambiente:

spring.datasource.url=jdbc:postgresql://localhost:5432/taskdb

spring.datasource.username=seu_usuario

spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update


### 3. Execute a aplicação
Você pode rodar pelo IntelliJ ou pelo terminal:

./mvnw spring-boot:run

ou

mvn spring-boot:run

A aplicação estará disponível em:
http://localhost:8070

## 📫 Endpoints principais da API

| Método | Endpoint          | Descrição                   |
|--------|-------------------|-----------------------------|
| `GET`  | `/api/tasks`      | Listar todas as tarefas     |
| `POST` | `/api/tasks`      | Criar nova tarefa           |
| `GET`  | `/api/tasks/{id}` | Buscar tarefa por ID        |
| `PUT`  | `/api/tasks/{id}` | Atualizar uma tarefa        |
| `DELETE`| `/api/tasks/{id}`| Deletar uma tarefa          |


## 👨‍💻 Autores
Felipe Carvalho Tardivo

Matheus Oliveira Mancio
