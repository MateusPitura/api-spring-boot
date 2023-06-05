package med.voll.api.medico;

import med.voll.api.Endereco.DadosEndereco;

public class DadosCadastroMedico{
    String nome;
    String email;
    String crm;
    Especialidades especialidade;
    DadosEndereco endereco;

    public DadosCadastroMedico(String nome, String email, String crm, Especialidades especialidade, DadosEndereco endereco) {
        this.nome = nome;
        this.email = email;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereco = endereco;
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

    public DadosEndereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(DadosEndereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return this.nome + " | " + this.email + " | " + this.crm + " | " + this.especialidade + " | " + this.endereco;
    }
}
