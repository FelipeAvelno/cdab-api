# Climate Data Analysis API for Brazil ⛅

API para análise e previsão de dados climáticos brasileiros com foco em eventos extremos.

## Tecnologias Utilizadas
- Java 17
- Spring Boot 3.1.0
- Spring Web MVC
- Springdoc OpenAPI (Documentação)
- Lombok

## Endpoints

### GET /api/climate
Parâmetros:
- cidade (opcional)
- estado (opcional)
- regiao (opcional)
- data (obrigatório, formato dd/MM/yyyy)

Exemplo de Request:
