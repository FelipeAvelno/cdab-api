# Climate Data Analysis API

Esta API tem como objetivo fornecer um retorno de dados para análise de dados climáticos brasileiros e previsão de eventos extremos. A aplicação foi desenvolvida em Java utilizando Spring Boot e segue os padrões de arquitetura de DTO's para garantir uma estrutura organizada e de fácil manutenção.

## Tecnologias Utilizadas

- **Java 17**: Versão moderna e amplamente utilizada em projetos empresariais.
- **Spring Boot**: Framework para desenvolvimento rápido de aplicações baseadas em microserviços e APIs REST.
- **Maven**: Gerenciamento de dependências e construção do projeto.
- **DTO (Data Transfer Object)**: Padrão de projeto para transferência de dados entre camadas da aplicação.
- **Lombok**: Para reduzir o boilerplate de código (getters, setters, etc.).

## Funcionalidades

- **Endpoint GET `/api/weather`**: Recebe parâmetros como nome da cidade, estado ou região e uma data (ex.: `27/02`) e retorna um objeto JSON com as seguintes informações:
  - Temperatura
  - Umidade
  - Sensação Térmica
  - Velocidade do Vento (em km/h)
  - Indicador de Evento Extremo (booleano)
 
## Exemplo de requisição

``http://localhost:8080/api/weather?city=SaoPaulo&day=27-02``

## Estrutura do Projeto

A estrutura do projeto é organizada em pacotes que separam as responsabilidades de cada camada:
- **controller**: Responsável por expor os endpoints REST.
- **service**: Contém a lógica de negócio e integrações com possíveis fontes de dados externas.
- **dto**: Objetos de transferência de dados entre as camadas.


## Como Executar

1. **Pré-requisitos**: Certifique-se de ter o Java 17 e o Maven instalados.
2. **Clonar o repositório**:
   ```bash
   git clone https://github.com/FelipeAvelno/cdab-api.git
   cd cdab-api
