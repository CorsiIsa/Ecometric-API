package br.com.fiap.ecometric.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
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

    @GetMapping("{email}")
    public Cadastro findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PostMapping
    public Cadastro create(@RequestBody CadastroRequest cadastro){
        return service.create(cadastro.toModel());
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @PutMapping("{id}")
    public Cadastro update(@PathVariable Long id, @RequestBody Cadastro cadastro){
        return service.update(id, cadastro);
    }
}
