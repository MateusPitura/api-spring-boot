package med.voll.api.Domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.Domain.Endereco.DadosEndereco;

public class DadosCadastroMedico{
    @NotBlank
    String nome;
    @NotBlank
    @Email
    String email;
    @NotBlank
    String telefone;
    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String crm;
    @NotNull
    Especialidades especialidade;
    @NotNull
    @Valid
    DadosEndereco endereco;

    public DadosCadastroMedico(String nome, String email, String telefone, String crm, Especialidades especialidade, DadosEndereco endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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

    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
