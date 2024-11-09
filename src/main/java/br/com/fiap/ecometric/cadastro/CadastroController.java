package br.com.fiap.ecometric.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    CadastroService service;
    
    @GetMapping
    public List<Cadastro> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Cadastro create(@RequestBody CadastroRequest cadastro){
        return service.create(cadastro.toModel());
    }
}
