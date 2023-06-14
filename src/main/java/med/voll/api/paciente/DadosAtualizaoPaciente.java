package med.voll.api.paciente;

import med.voll.api.Endereco.DadosEndereco;

public record DadosAtualizaoPaciente(
    Long id,
    String nome,
    String telefone,
    DadosEndereco endereco
){

}