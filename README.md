# Sistema de Monitoramento de Saúde
Java RESTful API criada para a ultima atividade DIO.
Sistema de Monitoramento de Saúde - Backend com java

## Principais Tecnologias
**Java 17** | **Spring Boot 3** | **Spring Data JPA** | **OpenAPI (Swagger)** | **Railway**

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
    class Paciente {
        +Long id
        +String nome
        +String dataNascimento
        +String sexo
        +String endereco
        +String telefone
        +String email
        +HistoricoMedico historico
        +Medicamentos medicamentos
        +RelatorioSaudeAtual saude
    }

    class HistoricoMedico {
        +Long id
        +String descricao
        +Date data
        +Paciente paciente
    }

    class Medicamento {
        +Long id
        +String nome
        +String dosagem
        +String frequencia
        +String duracao
        +Paciente paciente
    }

    class RelatorioSaudeAtual {
        +Long id
        +String descricao
        +Date dataGeracao
        +Paciente pacientea
    }

    Paciente "1" *-- "1" HistoricoMedico 
    Paciente "1" *-- "*" Medicamento
    Paciente "1" *-- "1" RelatorioSaudeAtual
```
