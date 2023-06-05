package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import med.voll.api.medico.DadosCadastroMedico;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public void olaMundo(DadosCadastroMedico dados){
        System.out.println(dados);
    }
}
