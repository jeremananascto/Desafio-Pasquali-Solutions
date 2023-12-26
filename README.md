# Projeto de Testes Automatizados - JSONPlaceholder API

## Descrição do Projeto

Este projeto tem como objetivo realizar testes automatizados na JSONPlaceholder API, uma API de teste que simula um servidor REST. Aqui você encontrará a implementação de testes para as funcionalidades de Cadastro de Post e Busca de Posts Cadastrados.

## Linguagem Utilizada

O projeto foi desenvolvido utilizando a linguagem de programação Java, conhecida por sua robustez e ampla aplicação em projetos de automação de testes.

## Framework de Testes

O framework escolhido para este projeto é o RestAssured, uma biblioteca Java que simplifica a automação de testes de API REST. Essa escolha proporciona uma fácil integração e expressividade nos testes.

## Design Pattern Utilizado

O projeto segue o padrão Page Object para estruturar os endpoints e seus respectivos passos. Além disso, utiliza os conceitos de POJO (Plain Old Java Objects) para a criação de modelos de request e response. A arquitetura é organizada em módulos, cada um responsável por uma camada específica do projeto.

## Estrutura do Projeto

```
|-- src
|   |-- main
|       |-- java
|           |-- endpoints
|               |-- CadastroPostEndpoint.java
|           |-- logic
|               |-- CadastroPostLogic.java
|           |-- model
|               |-- CadastroPostRequestModel.java
|               |-- CadastroPostResponseModel.java
|           |-- support
|               |-- utils
|                   |-- CommonUtils.java
|       |-- Runners
|           |-- RestRunner.java
|-- src
|   |-- test
|       |-- java
|           |-- steps
|               |-- CadastroPostSteps.java
|           |-- resources
|               |-- features
|                   |-- CadastroPost.feature
|           |-- TestData
|               |-- CadastroPostTestData.java
```

## Execução dos Testes

Antes de executar os testes, certifique-se de ter as dependências necessárias instaladas. Você pode fazer isso utilizando o seguinte comando:

```bash
# Instale as dependências do projeto
mvn clean install
```

### Executando os Testes

Para executar os testes, utilize a classe `RestRunner` localizada em `src/main/java/Runners/`. Esta classe contém a configuração do Cucumber para executar os cenários de teste.

1. **Via IDE (IntelliJ, Eclipse, etc.):**
    - Abra a classe `RestRunner` na sua IDE.
    - Execute a classe como um teste JUnit.

2. **Via Linha de Comando:**
    - Utilize o seguinte comando Maven na raiz do projeto:

      ```bash
      mvn test
      ```

   Este comando irá acionar a execução dos testes Cucumber configurados na classe `RestRunner`.

### Relatórios de Teste

Após a execução bem-sucedida dos testes, você pode encontrar relatórios detalhados na pasta `target/reports/`. Os relatórios em formato HTML e JSON estarão disponíveis para análise.

**Nota:** Certifique-se de ajustar as configurações de execução, como endpoints de API e dados de teste, conforme necessário, no arquivo `RestRunner` e nos arquivos de dados de teste.

A execução destes passos deve proporcionar uma execução bem-sucedida dos testes automatizados para validar o Cadastro de Post na sua aplicação, oferecendo feedback sobre a qualidade do serviço.

## Cenários de Teste

### Cadastro de Post:

1. Cadastrar post com todos os campos preenchidos.
2. Cadastrar post com o campo title sem valor.
3. Cadastrar post com o campo body sem valor.
4. Cadastrar post com um valor negativo no campo userID.
5. Cadastrar post com um valor 0 no campo userID.
6. Cadastrar post com valor 0 no campo userID e campos title e body vazios.
7. Cadastrar post não enviando o campo userID.
8. Cadastrar post não enviando o campo title.
9. Cadastrar post não enviando o campo body.
10. Cadastrar post não enviando os campos userID, title, body.

## Test Data

Os dados utilizados nos testes de Cadastro de Post estão localizados no pacote `TestData`.

## Observações Adicionais

- Os cenários foram escritos em Gherkin, proporcionando uma fácil compreensão por partes interessadas não técnicas.
- Utilizamos a técnica de Page Objects para estruturar os endpoints, e POJO para representar os modelos de request e response.
- Este projeto é destinado à avaliação técnica e didática, com base na API JSONPlaceholder.

## Análise SOLID

O projeto foi estruturado de acordo com os princípios SOLID:

- **S (Single Responsibility Principle):** Cada classe tem uma única responsabilidade, como `CadastroPostEndpoint` para manipular os endpoints, `CadastroPostLogic` para a lógica associada e `CadastroPostSteps` para os passos dos cenários.

- **O (Open/Closed Principle):** O projeto está aberto para extensões (novos cenários, novos endpoints), mas fechado para modificações nas classes existentes.

- **L (Liskov Substitution Principle):** As classes e interfaces são projetadas para serem substituíveis, permitindo a extensão sem modificar o comportamento.

- **I (Interface Segregation Principle):** As interfaces são coesas e específicas para cada módulo, evitando a implementação desnecessária de métodos.

- **D (Dependency Inversion Principle):** As dependências são injetadas, promovendo a inversão de controle e facilitando a substituição de implementações.

## Contribuições

Contribuições são bem-vindas! Fique à vontade para sugerir melhorias, correções ou novos cenários de teste.

## Agradecimentos

Agradecemos por considerar este projeto como parte do processo de avaliação técnica. Se houver qualquer dúvida ou feedback, entre em contato.
