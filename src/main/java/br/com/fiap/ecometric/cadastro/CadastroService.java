package br.com.fiap.ecometric.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    
    @Autowired
    CadastroRepository repository;

    public List<Cadastro> findAll(){
        return repository.findAll();
    }

    public Cadastro findByEmail(String email){
        return repository.findByEmailContainingIgnoreCase(email);
    }

    public Cadastro create(Cadastro empresa) {
        return repository.save(empresa);
    }

    public void delete( Long id){
        repository.deleteById(id);
    }

    public Cadastro update(Long id, Cadastro cadastro) {
        Optional<Cadastro> oldCadasto = repository.findById(id);
        
        Cadastro existingCadasto = oldCadasto.get();

        if (cadastro.getNomeEmpresa() != null && !cadastro.getNomeEmpresa().isEmpty()) {
            existingCadasto.setNomeEmpresa(cadastro.getNomeEmpresa());
        }
        if (cadastro.getRazaoSocial() != null && !cadastro.getRazaoSocial().isEmpty()) {
            existingCadasto.setRazaoSocial(cadastro.getRazaoSocial());
        }
        if (cadastro.getPorte() != null && !cadastro.getPorte().isEmpty()) {
            existingCadasto.setPorte(cadastro.getPorte());
        }
        if (cadastro.getEmail() != null && !cadastro.getEmail().isEmpty()) {
            existingCadasto.setEmail(cadastro.getEmail());
        }
        if (cadastro.getSenha() != null && !cadastro.getSenha().isEmpty()) {
            existingCadasto.setSenha(cadastro.getSenha());
        }
        if (cadastro.getCep() != null && !cadastro.getCep().isEmpty()) {
            existingCadasto.setCep(cadastro.getCep());
        }
        if (cadastro.getEndereco() != null && !cadastro.getEndereco().isEmpty()) {
            existingCadasto.setEndereco(cadastro.getEndereco());
        }
        if (cadastro.getBairro() != null && !cadastro.getBairro().isEmpty()) {
            existingCadasto.setBairro(cadastro.getBairro());
        }
        if (cadastro.getEstado() != null && !cadastro.getEstado().isEmpty()) {
            existingCadasto.setEstado(cadastro.getEstado());
        }
        if (cadastro.getContato() != null && !cadastro.getContato().isEmpty()) {
            existingCadasto.setContato(cadastro.getContato());
        }

        return repository.save(existingCadasto);
    }

}
