package med.voll.api.medico;

import jakarta.persistence.*;
import med.voll.api.Endereco.Endereco;

@Entity
@Table(name="medicos")
public class Medico{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidades especialidade;
    @Embedded
    private Endereco endereco;

    public Medico(String nome, String email, String telefone, String crm, Especialidades especialidade, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    public Medico(){

    }

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.getNome();
        this.email = dados.getEmail();
        this.telefone = dados.getTelefone();
        this.crm = dados.getCrm();
        this.especialidade = dados.getEspecialidade();
        this.endereco = new Endereco(dados.getEndereco());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidades getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidades especialidade) {
        this.especialidade = especialidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return this.nome + " | " + this.email + " | " + this.crm + " | " + this.especialidade + " | " + this.endereco;
    }
}
