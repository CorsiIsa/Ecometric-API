package br.com.fiap.ecometric.projetos;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    @Autowired
    ProjetoSevice service;
    
    @GetMapping
    public List<Projeto> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Projeto create(@RequestBody ProjetoRequest projeto){
        return service.create(projeto.toModel());
    }
}
