package med.voll.api.Domain.paciente;

import med.voll.api.Domain.Endereco.DadosEndereco;

public record DadosAtualizaoPaciente(
    Long id,
    String nome,
    String telefone,
    DadosEndereco endereco
){

}