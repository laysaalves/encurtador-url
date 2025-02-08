# Desafio do Encurtador de Url do [BackendBR](github.com/backend-br)

## Tech Stack
- **Java 21**: Versão moderna do Java para um código mais limpo e eficiente
- **Spring Framework**: Spring Boot incluso para acelerar o desenvolvimento e Spring Data para interagir com o banco de dados.
- **Docker**: Pensando na rapidez de executar o banco dados e utilizá-lo
- **MySQL**: Banco de dados para armazenar o que deve persistir
- **OpenAPI**: Para documentar mapeando as rotas da API e exibir através do Swagger

### Estrutura do projeto
```plaintext
src
├── main
│   ├── java
│   │   └── dev.layseiras.encurtador
│   │       ├── doc       # Configuração do Swagger com OpenAPI
│   │       ├── domain       # Regras de negócio (Core)
│   │       └── infra # Controller e Repository para a camada de apresentação
│   │
│   └── resources
│       └── application.yml  # Configuração da aplicação
│       
└── docker-compose.yml  # Script para usar a imagem do MySQL
```

---

## Rodando na sua máquina

### Pré requisitos
Você deve ter localmente:
- [Java 21](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
- [Docker](https://www.docker.com/)
- [Maven](https://maven.apache.org/) (em caso de não usar Docker)

### Instalando
1. Clone esse repositório:
   ```bash
   git clone https://github.com/laysaalves/encurtador-url.git
   cd encurtador-url
   ```

2. Suba a aplicação com o Docker:
   ```bash
   docker-compose up
   ```

3. Veja a documentação da API (Swagger):
   ```
   http://localhost:8080/swagger-ui/index.html
   ```

---

## API Endpoints

- **GET /r/{urlEncurtada}**: Retorna a Url.
- **POST /encurtei**: Cria uma nova Url encurtada.

---

## Contribua
Contribuições são bem-vindas, veja como fazer:
1. Dê um fork nesse projeto.
2. Crie uma branch para a feature: `git checkout -b feature-name`
3. Faça um commit com as alterações: `git commit -m 'Add new feature'`
4. Envie a branch: `git push origin feature-name`
5. Abra um pull request.

---

## License
Esse projeto está sob a licença: [MIT License](LICENSE).

---

## Contato
Se quiser bater um papo ou dar algum feedback, me chame em linkedin/laysaalves ou envie um e-mail para laysa.developer@gmail.com :)