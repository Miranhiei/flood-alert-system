# 🌊 Flood Alert System
> 🚨 Sistema Inteligente de Detecção, Alerta e Contenção de Enchentes

Este projeto simula um sistema automatizado que coleta dados ambientais (nível da água, clima, etc.), gera alertas com base em risco e executa ações de contenção como ativação de barreiras. Ele visa aumentar a segurança de comunidades urbanas em áreas vulneráveis.

---

## 🧠 Objetivo

- Monitorar níveis de água, intensidade de chuva, temperatura e umidade.
- Emitir alertas automáticos quando o nível de risco ultrapassar limites definidos.
- Controlar ações automatizadas de contenção (como barreiras de enchente).
- Armazenar histórico de eventos e permitir consultas posteriores.

---

## 👨‍💻 Integrantes

| Nome Completo             | RM       |
|---------------------------|----------|
| Amaury Tenório Niza       | 559108   |
| Mateus Miranda            | 559215   |

---

## 📁 Estrutura do Projeto

```plaintext
flood-alert-system/
├── src/
│   └── main/
│       ├── java/com/example/flood/
│       │   ├── controller/       # Endpoints REST (API)
│       │   ├── service/          # Regras de negócio
│       │   ├── repository/       # Interfaces JPA
│       │   ├── model/            # Entidades persistentes
│       │   └── FloodAlertSystemApplication.java
│       └── resources/
│           └── application.properties
├── data/
│   └── flood-db.mv.db          # Banco H2 persistente
├── pom.xml
├── README.md
```

---

## 🛠️ Tecnologias Utilizadas

- ✅ **Java 17**
- ✅ **Spring Boot 3**
- ✅ **Spring Web** – Criação dos endpoints RESTful
- ✅ **Spring Data JPA** – Persistência de dados com ORM
- ✅ **H2 Database (modo arquivo)** – Armazenamento local e persistente
- ✅ **Postman** – Testes de API REST
- ✅ **Maven** – Gerenciamento de dependências e build

---

## 📲 Usabilidade no Dia a Dia

- 🌧️ **Prefeituras e Defesa Civil** podem usar para tomar ações emergenciais automatizadas.
- 🏘️ **Condomínios em áreas de risco** podem simular sensores locais para evacuação.
- 🧪 **Ambientes acadêmicos** usam como PoC para projetos com IoT e automação.
- 📊 **Análise histórica** de enchentes e gatilhos de eventos podem ajudar na prevenção.

---

## 🔗 API do Projeto – Endpoints

### 📡 `/api/sensores`
- `POST`: Enviar dados simulados de sensores.
- `GET`: Listar todos os dados coletados.

### ⚠️ `/api/alertas`
- `GET`: Listar todos os alertas gerados (nível MÉDIO ou ALTO).

### 🔧 `/api/controle`
- `POST`: Ativar barreira de contenção via `?action=...`
- `GET`: Listar histórico de ações realizadas

---

## 🧪 Exemplo de Uso no Postman

```json
POST /api/sensores
{
  "waterLevel": 92.5,
  "temperature": 27.0,
  "humidity": 88.0,
  "rainIntensity": 35.0
}
```

✅ Isso criará:
- Um registro de sensor no banco
- Um alerta automático com risco ALTO
- Visualização disponível em `/api/alertas`

---

## 💾 Console do H2

- Acesse via: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:file:./data/flood-db`
- Usuário: `sa`
- Senha: *(deixe em branco)*

---

## 🚀 Como executar o projeto

```bash
git clone https://github.com/Miranhiei/flood-alert-system.git
cd flood-alert-system
mvn clean install
mvn spring-boot:run
```

---

## 🧩 Detalhes Técnicos

- O backend segue o padrão **MVC (Model-View-Controller)**.
- Cada camada está bem separada para facilitar manutenção e testes:
  - `controller/` → Recebe requisições REST
  - `service/` → Contém a lógica de alerta e controle
  - `repository/` → Usa Spring Data para abstrair persistência
  - `model/` → Define as entidades JPA mapeadas no banco H2
- O banco H2 funciona **em modo arquivo** e pode ser facilmente versionado junto com o código.

---

## ✅ Requisitos Atendidos

- [x] API RESTful com Spring Boot
- [x] Armazenamento em banco H2 persistente no diretório `/data`
- [x] Testes realizados via Postman
- [x] Projeto versionado no GitHub
- [x] Estrutura modular e reutilizável
- [x] Documentação completa (`README.md`)

---

## 📄 Licença

Projeto acadêmico para a disciplina  
**Técnicas Avançadas de Programação** – FIAP (2025).
