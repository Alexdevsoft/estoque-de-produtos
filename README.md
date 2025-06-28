# Estoque API - Spring Boot REST

![Java](https://img.shields.io/badge/Java-17+-red?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen?style=for-the-badge&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge&logo=apachemaven)
![H2 Database](https://img.shields.io/badge/H2-Database-lightgrey?style=for-the-badge&logo=h2)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)


API RESTful desenvolvida com Java e Spring Boot para gerenciar produtos em um sistema de estoque.  
Este projeto aplica diversos **padrões de projeto**, como DTO, Factory, Service, Repository e Controller.

---

## 🚀 Funcionalidades

- Adicionar produto
- Listar todos os produtos
- Remover produto por ID

---

## 🛠️ Tecnologias

- Java 17+
- Spring Boot 3+
- Spring Data JPA
- H2 Database
- Maven

---

## 📦 Padrões de Projeto Utilizados

| Padrão     | Aplicação                     |
|------------|-------------------------------|
| DTO        | Separação entre entidade e requisição |
| Factory    | Criação de instância de entidade a partir de DTO |
| Service    | Regras de negócio da aplicação |
| Repository | Persistência de dados          |
| Controller | Camada de entrada da API       |

---

## 🔧 Como executar

```bash
# Clone o projeto
git clone hhttps://github.com/Alexdevsoft/estoque-de-produtos
cd estoque-api

# Compile e rode a aplicação
./mvnw spring-boot:run
```

Acesse: [http://localhost:8080/api/produtos](http://localhost:8080/api/produtos)

---

## 🧪 Exemplos de uso (prints)

### POST /api/produtos

![](https://i.postimg.cc/T20zFnh0/post-produto.png)

---

### GET /api/produtos

![](https://i.postimg.cc/7Ymq3pgx/get-produtos.png)

---

### DELETE /api/produtos/{{id}}

![](https://i.postimg.cc/SRxvktjr/delete-produto.png)

---

## 📂 H2 Console

Acesse em: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
JDBC URL: `jdbc:h2:mem:estoque-db`

---

## Autor: [Alexsandro Almeida](www.linkedin.com/in/alexsandro-j-a-almeida)