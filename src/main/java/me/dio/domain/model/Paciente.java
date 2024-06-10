package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String endereco;
    private String telefone;

    @Column(unique = true)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private HistoricoMedico historico;

    @OneToOne(cascade = CascadeType.ALL)
    private Medicamento medicamentos;

    @OneToOne(cascade = CascadeType.ALL)
    private RelatorioSaudeAtual saudeAtual;

    public long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email; }

    public HistoricoMedico getHistorico() { return historico; }
    public void setHistorico(HistoricoMedico historico) { this.historico = historico; }

    public Medicamento getMedicamentos() { return medicamentos; }
    public void setMedicamentos(Medicamento medicamentos) { this.medicamentos = medicamentos; }

    public RelatorioSaudeAtual getSaudeAtual() { return saudeAtual;}
    public void setSaudeAtual(RelatorioSaudeAtual saudeAtual) { this.saudeAtual = saudeAtual; }
}
