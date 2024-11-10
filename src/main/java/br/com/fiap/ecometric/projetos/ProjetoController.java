package br.com.fiap.ecometric.projetos;
import java.util.List;
import java.util.Optional;

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
    @GetMapping("{id}")
    public Optional<Projeto> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public Projeto create(@RequestBody ProjetoRequest projeto){
        return service.create(projeto.toModel());
    }
}
