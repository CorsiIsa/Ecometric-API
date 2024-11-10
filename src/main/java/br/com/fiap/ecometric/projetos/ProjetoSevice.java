package br.com.fiap.ecometric.projetos;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjetoSevice {

    @Autowired
    ProjetoRepository repository;

    public List<Projeto> findAll(){
        return repository.findAll();
    }

    public Projeto create(Projeto monitoramento) {
        return repository.save(monitoramento);
    }
    
}
