package med.voll.api.Domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.Domain.Endereco.DadosEndereco;

public class DadosAtualizacaoMedico{
    @NotNull
    private Long id;
    private String nome;
    private String telefone;
    private DadosEndereco endereco;
    
    public DadosAtualizacaoMedico(String nome, String telefone, DadosEndereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
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
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public DadosEndereco getEndereco() {
        return endereco;
    }
    public void setEndereco(DadosEndereco endereco) {
        this.endereco = endereco;
    }

}
