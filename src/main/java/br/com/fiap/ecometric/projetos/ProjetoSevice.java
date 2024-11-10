package br.com.fiap.ecometric.projetos;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjetoSevice {

    @Autowired
    ProjetoRepository repository;

    public List<Projeto> findAll(){
        return repository.findAll();
    }

    public Optional<Projeto> findById(Long id){
        return repository.findById(id);
    }
    public Projeto create(Projeto monitoramento) {
        return repository.save(monitoramento);
    }
    
}
