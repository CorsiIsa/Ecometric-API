package br.com.fiap.ecometric.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  CadastroRepository  extends JpaRepository<Cadastro, Long>{

    Cadastro findByEmail(String email);

    Cadastro findByEmailContainingIgnoreCase(String email);
}
