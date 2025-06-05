# 🍽️ Sistema de Reservas de Restaurante

Este é um sistema backend desenvolvido em **Spring Boot** para gerenciar reservas de mesas em um restaurante. Usuários podem se registrar, fazer login e realizar reservas. Admins possuem permissões adicionais para gerenciamento das mesas.

---

## 🚀 Funcionalidades

### 👤 Usuários
- Registro e autenticação com Spring Security (JWT)
- Permissões baseadas em perfis (usuário e admin)
- Listagem e cancelamento de reservas pessoais

### 🪑 Mesas
- Criação, edição e remoção de mesas (admin)
- Visualização de mesas disponíveis

### 📅 Reservas
- Reserva de mesas em datas e horários disponíveis
- Cancelamento de reservas
- Regras para evitar reservas duplicadas e em horários inválidos

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Security (JWT)**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
- **Flyway (migrações de banco - opcional)**
- **Docker (opcional)**

---

## 🧱 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com.exemplo.restaurante/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       ├── service/
│   │       ├── security/
│   │       └── RestauranteApplication.java
│   └── resources/
│       ├── application.properties
│       └── schema.sql (caso não use Flyway)
```

---

## 📦 Banco de Dados

**Entidades principais:**
- `Usuario` → id, nome, email, senha, role
- `Mesa` → id, nome, capacidade, status
- `Reserva` → id, usuario_id, mesa_id, data_hora, status

Relacionamentos:
- Um usuário pode ter muitas reservas
- Uma mesa pode ter muitas reservas
- Cada reserva pertence a um usuário e a uma mesa

---

## 🔐 Autenticação e Autorização

- Autenticação baseada em **JWT (JSON Web Token)**
- Middleware de segurança configurado com Spring Security
- Endpoints protegidos por perfil:
  - `/admin/**` apenas para ROLE_ADMIN
  - `/reservas/**` apenas para usuários autenticados

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/sistema-reservas-restaurante.git
   cd sistema-reservas-restaurante
   ```

2. Configure o `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/reservasdb
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

   jwt.secret=segredoSuperSecreto
   jwt.expiration=3600000
   ```

3. Execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

---

## 🧪 Endpoints Exemplo (via Swagger ou Postman)

| Método | Endpoint               | Descrição                         |
|--------|------------------------|-----------------------------------|
| POST   | /auth/register         | Registrar novo usuário            |
| POST   | /auth/login            | Login e geração de token          |
| GET    | /mesas                 | Listar mesas disponíveis          |
| POST   | /mesas                 | Criar nova mesa (admin)           |
| POST   | /reservas              | Criar nova reserva                |
| GET    | /reservas              | Listar reservas do usuário        |
| PATCH  | /reservas/{id}/cancelar| Cancelar reserva                  |

---

## 📌 Melhorias Futuras

- Dashboard com estatísticas de reservas
- Frontend com React ou Angular
- Sistema de notificação por e-mail
- Integração com Google Calendar

---

## 🤝 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests com melhorias.

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
