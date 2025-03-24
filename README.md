# Barbearia App
Um aplicativo de gerenciamento de barbearia construído com Angular e Spring Boot. O objetivo do projeto é criar um sistema simples para cadastrar e listar clientes, com um frontend funcional e um backend para gerenciar os dados dos clientes.
## Funcionalidades
- Cadastro de Clientes: Formulário para cadastrar novos clientes com nome e telefone. - Listagem de Clientes: Exibe todos os clientes cadastrados em uma tabela. - Interface Simples: Interface funcional com Angular, usando CSS básico para estilização. - API REST: Backend com endpoints para listar e cadastrar clientes, usando Spring Boot e banco H2 em memória. - Persistência de Dados: Banco de dados H2 em memória para armazenar os clientes (os dados são resetados a cada reinicialização).
## Como Rodar o Projeto
Siga os passos abaixo para rodar o projeto localmente.
### Pre-requisitos
- Java 17 ou superior - Node.js 20.x - npm (gerenciador de pacotes do Node.js) - Maven (geralmente incluído no projeto como `mvnw`)
### Passos
1. Verifique se os pré-requisitos estão instalados: ```bash java -version  # Deve mostrar Java 17 node -v       # Deve mostrar Node.js 20.x npm -v        # Deve mostrar a versão do npm ``` 2. Inicie o backend (Spring Boot): Entre no diretório do backend: ```bash cd barbearia-app/server ``` Inicie o servidor: ```bash ./mvnw spring-boot:run ``` O backend rodará na porta 8080. Teste acessando: ```bash http://localhost:8080/api/clients ``` (deve retornar `[]`) e ```bash http://localhost:8080/h2-console ``` (use URL: `jdbc:h2:mem:testdb`, usuário: `sa`, senha em branco). 3. Inicie o frontend (Angular): Entre no diretório do frontend: ```bash cd barbearia-app ``` Instale as dependências: ```bash npm install ``` Inicie o servidor Angular: ```bash ng serve ``` O frontend rodará na porta 4200. 4. Acesse o app: Abra o navegador e acesse http://localhost:4200. 5. Teste a aplicação: No navegador, vá para `/register` e cadastre um cliente (ex.: Nome: "João Silva", Telefone: "(11) 99999-9999"). Depois, vá para `/list` e veja a lista de clientes.
### Notas
- O projeto funciona localmente, mas não no Project IDX devido a problemas de autenticação entre portas públicas (4200 e 8080). O Project IDX redireciona requisições para autenticação (`forwardAuthCookie`), e o proxy configurado no Angular não funcionou como esperado. - O banco H2 é em memória, então os dados são resetados a cada reinicialização do backend.
## Tecnologias Usadas
- Java 17: Linguagem de programação (backend). - Spring Boot 3.4.4: Framework para criar a API REST. - Spring Data JPA: Para acesso ao banco de dados. - H2 Database: Banco de dados em memória. - Angular 18: Framework para o frontend. - TypeScript: Linguagem usada no frontend. - Maven: Gerenciador de dependências do backend. - npm: Gerenciador de dependências do frontend. - Project IDX: Ambiente de desenvolvimento usado para criar o projeto.
## Testes
O projeto ainda não inclui testes unitários, mas eles podem ser adicionados para o backend (ex.: testar o ClientController com @WebMvcTest) e para o frontend (ex.: testar componentes Angular com Jasmine).
## Proximos Passos
Aqui estão algumas ideias pra melhorar o projeto: - Adicionar Agendamento: Implementar uma funcionalidade para agendar horários para os clientes. - Persistência de Dados: Substituir o H2 em memória por um banco de dados persistente como PostgreSQL ou MySQL. - Melhorias na UI: Adicionar Bootstrap para estilizar o frontend. - Autenticação: Implementar login com Spring Security e Angular. - Deploy: Fazer deploy do app em uma plataforma como Heroku ou Render.
## Contribuicao
Se tu quiser contribuir pro projeto, sinta-se a vontade pra abrir um pull request ou reportar issues no GitHub! 1. Faça um fork do repositório. 2. Crie uma branch pra tua feature: ```bash git checkout -b minha-feature ``` 3. Faça commit das tuas alterações: ```bash git commit -m "Adiciona minha feature" ``` 4. Faça push da branch: ```bash git push origin minha-feature ``` 5. Abra um pull request no GitHub.
## Licenca
Este projeto é licenciado sob a MIT License.
---
Feito por Pedro Savio.
