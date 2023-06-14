package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.paciente.DadosAtualizaoPaciente;
import med.voll.api.paciente.DadosCadastroPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados){
        repository.save(new Paciente(dados));
    }

    // @GetMapping
    // public Page<Paciente> listar(Pageable pageable){
    //     return repository.findAll(pageable);
    // }

    @GetMapping
    public Page<Paciente> listar(Pageable pageable){
        return repository.findAllByAtivoTrue(pageable);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizaoPaciente dados){
        Paciente paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);

    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public void exlcuir(@PathVariable Long id){
        Paciente paciente = repository.getReferenceById(id);
        paciente.excluir();
    }
}
