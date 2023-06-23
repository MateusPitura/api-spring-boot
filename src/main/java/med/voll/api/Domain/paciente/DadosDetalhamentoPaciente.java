package med.voll.api.Domain.paciente;

import med.voll.api.Domain.Endereco.Endereco;

public record DadosDetalhamentoPaciente(
    Long id,
    String nome,
    String email,
    String telefone,
    String cpf,
    Endereco endereco,
    Boolean ativo
) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(
            paciente.getId(),
            paciente.getNome(),
            paciente.getEmail(),
            paciente.getTelefone(),
            paciente.getCpf(),
            paciente.getEndereco(),
            paciente.getAtivo()
        );
    }
}
