# 📅 Agendador de Tarefas (Spring Boot)

API backend para gerenciamento de tarefas, desenvolvida com Spring Boot, com foco em escalabilidade, segurança e integração com serviços externos.

---

## 🚀 Tecnologias utilizadas

* Java 21
* Spring Boot 4
* Spring Web MVC
* Spring Data MongoDB
* Spring Security
* Spring Cloud OpenFeign
* Gradle

---

## 📌 Objetivo do projeto

Este projeto tem como objetivo servir como base para um sistema de agendamento de tarefas (Task Manager), permitindo no futuro:

* Criar tarefas
* Listar tarefas
* Atualizar tarefas
* Deletar tarefas
* Autenticação de usuários
* Integração com APIs externas

---

## ⚙️ Como executar o projeto

### Pré-requisitos

* Java 21+
* Gradle (ou usar o wrapper incluído)
* MongoDB (opcional, ainda não configurado)

### Executando

```bash
./gradlew bootRun
```

Ou no Windows:

```bash
gradlew.bat bootRun
```

A aplicação irá iniciar em:

```
http://localhost:8080
```

---

## 📂 Estrutura do projeto

```
src/
 ├── main/
 │   ├── java/com/hady/agendadortarefas
 │   │   └── AgendadorTarefasApplication.java
 │   └── resources/
 │       └── application.properties
 └── test/
     └── ...
```

---

## ⚠️ Status do projeto

🚧 Em desenvolvimento

Atualmente o projeto contém apenas a estrutura inicial gerada com Spring Boot. As funcionalidades principais ainda serão implementadas.

---

## 🔮 Próximos passos

* [ ] Criar entidade Task
* [ ] Implementar CRUD de tarefas
* [ ] Configurar MongoDB
* [ ] Implementar autenticação com Spring Security
* [ ] Criar documentação da API (Swagger)

---

## 👨‍💻 Autor

Desenvolvido por Hady Nassar


