package br.com.fiap.ecometric.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    
    @Autowired
    CadastroRepository repository;

    public List<Cadastro> findAll(){
        return repository.findAll();
    }

    public Cadastro create(Cadastro empresa) {
        return repository.save(empresa);
    }
}
