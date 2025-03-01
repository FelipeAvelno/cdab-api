# 🌦️ 

<p align="center">
  <img src="https://img.icons8.com/color/96/000000/brazil.png" alt="Bandeira do Brasil"/>
  <br>
  <em>Plataforma de análise de dados climáticos brasileiros para previsão de eventos extremos</em>
</p>

<p align="center">
  <a href="https://github.com/seu-usuario/clima-brasil/actions/workflows/build.yml">
    <img src="https://github.com/seu-usuario/clima-brasil/actions/workflows/build.yml/badge.svg" alt="Build Status">
  </a>
  <a href="https://github.com/seu-usuario/clima-brasil/blob/main/LICENSE">
    <img src="https://img.shields.io/badge/License-MIT-green.svg" alt="License">
  </a>
</p>

---

## 🎯 Objetivo  
Desenvolver uma ferramenta open source para análise de padrões climáticos no Brasil, com foco em:  
- 🚨 Alertas de secas e enchentes  
- 🌱 Impactos na agricultura  
- 🔥 Monitoramento de queimadas  

![Dashboard de Exemplo](docs/screenshots/dashboard.png)  
*Dashboard interativo com dados de precipitação (Fonte: INMET)*  

---

## 📦 Funcionalidades  
| Módulo | Descrição |  
|--------|-----------|  
| **Previsão de Secas** | Modelo ML para risco hídrico em regiões do Nordeste |  
| **Monitor de Queimadas** | Integração com dados do INPE em tempo real |  
| **Histórico Climático** | Análise comparativa de dados desde 1990 |  
| **API REST** | Acesso programático para pesquisadores |  

---

## 🛠️ Tecnologias  
- **Backend:** Java 17, Quarkus, Apache Spark  
- **Frontend:** React, Grafana, MapLibre GL JS  
- **Banco de Dados:** PostgreSQL + PostGIS  
- **Infra:** Docker, AWS EC2 (Região São Paulo)  

---

## 📊 Fontes de Dados  
| Fonte | Descrição |  
|-------|-----------|  
| [INMET](https://portal.inmet.gov.br/) | Dados meteorológicos históricos |  
| [Sistema Nacional de Águas](https://www.snirh.gov.br/hidroweb/) | Níveis de rios e reservatórios |  
| [CPTEC/INPE](http://www.cptec.inpe.br/) | Alertas de queimadas |  

---

## 🚀 Como Executar  
```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/clima-brasil.git

# 2. Execute com Docker
docker-compose up -d

# Acesse:
# - API: http://localhost:8080
# - Dashboard: http://localhost:3000
