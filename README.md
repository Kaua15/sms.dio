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
    }

    class Consulta {
        +Long id
        +Date data
        +String hora
        +String descricao
        +Paciente paciente
        +Medico medico
    }

    class Medico {
        +Long id
        +String nome
        +String especialidade
        +String telefone
        +String email
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

    class Alerta {
        +Long id
        +String descricao
        +Date data
        +String tipo
        +Paciente paciente
    }

    class RelatorioSaude {
        +Long id
        +String descricao
        +Date dataGeracao
        +Paciente paciente
    }

    Paciente "1" -- "*" Consulta : "tem"
    Consulta "1" -- "1" Medico : "é realizada por"
    Paciente "1" -- "*" HistoricoMedico : "possui"
    Paciente "1" -- "*" Medicamento : "usa"
    Paciente "1" -- "*" Alerta : "recebe"
    Paciente "1" -- "*" RelatorioSaude : "tem"
```