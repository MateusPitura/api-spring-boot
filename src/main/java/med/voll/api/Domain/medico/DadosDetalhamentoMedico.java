package med.voll.api.Domain.medico;

import med.voll.api.Domain.Endereco.Endereco;

public record DadosDetalhamentoMedico(
    Long id,
    String nome,
    String email,
    String crm,
    String telefone,
    Especialidades especialidades,
    Endereco endereco
) {
    public DadosDetalhamentoMedico(Medico medico){
        this(
            medico.getId(), 
            medico.getNome(), 
            medico.getEmail(), 
            medico.getCrm(), 
            medico.getTelefone(),
            medico.getEspecialidade(), 
            medico.getEndereco()
        );
    }
}
