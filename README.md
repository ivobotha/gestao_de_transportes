# gestao_de_transportes

# Sistema de Transporte Escolar

Este projeto é um sistema básico para controle do transporte escolar e de funcionários, desenvolvido em Java. O sistema gerencia entidades como alunos, responsáveis, motoristas, veículos, rotas e presenças.

## Funcionalidades principais

- Cadastro e gerenciamento de alunos e seus responsáveis
- Controle de motoristas e veículos
- Definição e atribuição de rotas para motoristas e veículos
- Registro de presença dos alunos nas rotas em dias específicos
- Gestão de usuários do sistema com diferentes tipos/perfis

## Modelo de Dados

O sistema é estruturado em classes Java representando as principais entidades:

- **Aluno**: dados pessoais e seu responsável
- **Responsável**: informações de contato do responsável pelo aluno
- **Motorista**: dados do motorista e sua CNH
- **Veículo**: dados do veículo e capacidade
- **Rota**: nome, turno, horários e motorista responsável
- **Presença do Aluno**: registro de presença por data e rota
- **Usuário** e **TipoUsuario**: para controle de acesso ao sistema


## Tecnologias utilizadas

- Java 17
- Spring Boot (planejado para próxima fase)
- JPA/Hibernate (para persistência no banco de dados)
- Maven/Gradle para gerenciamento de dependências

## Como executar

1. Clone o repositório
2. Importe o projeto em sua IDE favorita
3. Configure conexão com banco de dados (exemplo: MySQL, PostgreSQL)
4. Execute a aplicação


