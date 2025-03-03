# Climate Data API

Esta aplicação é uma API desenvolvida em Java 17 com Spring Boot para análise de dados climáticos brasileiros. O objetivo é fornecer informações sobre a previsão do tempo (temperatura, umidade, sensação térmica e velocidade do vento) para cidades, estados ou regiões do Brasil em uma data específica.

## Funcionalidades

- Consulta de previsão do tempo via requisição HTTP GET.
- Conversão de nome de cidade/estado/região para coordenadas geográficas utilizando uma API Geocoding.
- Consulta de dados climáticos em tempo real utilizando a API Open Meteo.
- Retorno dos dados climáticos em formato JSON.

## Tecnologias Utilizadas

- **Java 17** – Linguagem de programação.
- **Spring Boot** – Framework para construção da API.
- **Spring Web** – Para criação dos endpoints REST.
- **RestTemplate** – Para consumo das APIs externas (Geocoding e Open Meteo).

## Exemplo de requisição

```bash
http://localhost:8080/clima?location=Sao+Paulo&date=27/02
```

## Como Executar

1. **Pré-requisitos**: Certifique-se de ter o Java 17 e o Maven instalados.
2. **Clonar o repositório**:
   ```bash
   git clone https://github.com/FelipeAvelno/cdab-api.git
   cd cdab-api

