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

GET /api/climate?cidade=São Paulo&data=27/02/2024

Exemplo de Response:
```json
{
    "local": "São Paulo",
    "dataConsulta": "2024-02-27T15:30:45",
    "temperatura": 28.5,
    "umidade": 65.0,
    "sensacaoTermica": 30.0,
    "ventoKmh": 15.0,
    "alertaEventoExtremo": "Tempestade prevista"
}
```

### Como executar

1. Clone o repositório
2. Execute com Maven:
```bash
mvn spring-boot:run
# A API estará disponível em http://localhost:8080
