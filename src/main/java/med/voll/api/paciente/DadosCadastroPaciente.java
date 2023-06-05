package med.voll.api.paciente;

import med.voll.api.Endereco.DadosEndereco;

public class DadosCadastroPaciente {
    String nome;
    String email;
    String telefone;
    String cpf;
    DadosEndereco endereco;

    public DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public DadosEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(DadosEndereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return this.nome + " | " + this.email + " | " + this.telefone + " | " + this.cpf + " | " + this.endereco;
    }
}
