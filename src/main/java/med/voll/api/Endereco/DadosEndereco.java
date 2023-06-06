package med.voll.api.Endereco;

import jakarta.validation.constraints.*;

public class DadosEndereco {
    @NotBlank
    String logradouro;
    @NotBlank
    String bairro;
    @NotBlank
    @Pattern(regexp = "\\d{8}")
    String cep;
    @NotBlank
    String cidade;
    @NotBlank
    String uf;
    String numero;
    String complemento;

    public DadosEndereco(String logradouro, String bairro, String cep, String cidade, String uf, String numero, String complemento) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    @Override
    public String toString() {
        return this.logradouro + " | " + this.bairro + " | " + this.cep + " | " + this.cidade + " | " + this.uf + " | " + this.numero + " | " + this.complemento;
    }
}
