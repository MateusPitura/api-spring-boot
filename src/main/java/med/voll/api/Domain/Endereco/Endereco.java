package med.voll.api.Domain.Endereco;

import jakarta.persistence.*;

@Embeddable
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;

    public Endereco(String logradouro, String bairro, String cep, String cidade, String uf, String numero, String complemento) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Endereco(){
        
    }

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.getLogradouro();
        this.bairro = endereco.getBairro();
        this.cep = endereco.getCep();
        this.cidade = endereco.getCidade();
        this.uf = endereco.getUf();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
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

    public void atualizarInformacoes(DadosEndereco dados) {
        if(dados.getLogradouro()!=null){
            this.logradouro = dados.getLogradouro();
        }
        if(dados.getBairro()!=null){
            this.bairro = dados.getBairro();
        }
        if(dados.getCep()!=null){
            this.cep = dados.getCep();
        }
        if(dados.getCidade()!=null){
            this.cidade = dados.getCidade();
        }
        if(dados.getUf()!=null){
            this.uf = dados.getUf();
        }
        if(dados.getNumero()!=null){
            this.numero = dados.getNumero();
        }
        if(dados.getComplemento()!=null){
            this.complemento = dados.getComplemento();
        }
    }
}
