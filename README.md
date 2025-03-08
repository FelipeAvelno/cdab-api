# Climate Data API

Esta aplicação é uma API desenvolvida em Java 17 com Spring Boot para análise de dados climáticos. O objetivo é fornecer informações sobre a previsão do tempo (temperatura, umidade, sensação térmica e velocidade do vento) para cidades, estados ou regiões do Brasil em uma data específica.

> [!NOTE]
> São utilizadas outras duas [API's](#observações) para receber uma localização para ser convertida em latitude e longitude e outra para informar os dados climáticos.

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

## Como Executar

1. **Pré-requisitos**: Certifique-se de ter o [Java 17](https://www.oracle.com/br/java/technologies/downloads/) e o [Maven](https://maven.apache.org/download.cgi) instalados.

2. **Clonar o repositório**:
   ```bash
   git clone https://github.com/FelipeAvelno/cdab-api.git
   cd cdab-api
   ```

3. **Execute esses comandos:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Realize uma requisição /GET:**
   ```bash
   http://localhost:8080/clima?location=Sao+Paulo&date=2023-03-04
   ```
   
### Observações:

> [!WARNING]
> Enviar data que não estão na base de dados da API (geralmente dados de muito tempo atrás) gerará um erro em forma de .json,  Deve enviar ano, mês e dia (enviar dias que ainda não ocorreram gerará erro).
Os dados podem variar em aproximadamente 4 unidades.

> [!NOTE]
> API's utilizadas:
> - [OpenMeteo](https://open-meteo.com/en/docs/historical-weather-api)<br>
> - [GeoCoding](https://developers.google.com/maps/documentation/geocoding/overview?hl=pt-br)

