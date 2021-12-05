# web-service-clients
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Romariorfr/web-service-clients/blob/master/LICENSE) 

## 1. Sobre o projeto:

Web service clients é um desafio proposto ao final do primeiro capítulo do bootcamp Spring Reac evento organizado pela DevSuperior. O projeto consiste na criação de um crud completo (Create, Read, Update, Delete) de clientes. Foram colocados em prática vários conceitos aprendidos ao longo do curso como organização do projeto em camadas, aplicar o padrão DTO(Data Transfer Object), tratamento de exceções,paginação de dados e também aplicado boas práticas de programação que é fundamental para todo desenvolvimento de qualidade.

## 1.1 Modelo conceitual do projeto:

![Web 1](https://github.com/Romariorfr/web-service-clients/blob/master/backend/assets/client.png)


## 1.2 Proposta do projeto:

Entregar um projeto Spring Boot 2.4.x contendo um CRUD completo de web
services REST para acessar um recurso de clientes, contendo as cinco operações básicas
aprendidas no capítulo:
* Busca paginada de recursos
* Busca de recurso por id
* Inserir novo recurso
* Atualizar recurso
* Deletar recurso

# 2. Tecnologias utilizadas
## 2.1 Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven


## 3. Como rodar a aplicação na sua maquina


```bash
# clonar repositório
git clone https://github.com/Romariorfr/web-service-clients

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```


## 4. Testes manuais no postman
### 4.1 Requisições da classe Client

```bash
#Busca paginada de clientes
GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name

#Busca de clientes por id
GET /clients/1

#Inserir novo cliente
POST /clients
{
"name": "Maria Silva",
"cpf": "12345678901",
"income": 6500.0,
"birthDate": "1994-07-20T10:30:00Z",
"children": 2
}

#Atualizar um cliente
PUT /clients/1
{
"name": "Maria Silvaaa",
"cpf": "12345678901",
"income": 6500.0,
"birthDate": "1994-07-20T10:30:00Z",
"children": 2
}

#Deletar uma categoria
DELETE /clients/1

```

# 5. Autor

Romário Ferreira de Rezende

https://www.linkedin.com/in/romarioferreiradeveloper
