package br.com.fiap.ecometric.projetos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProjetoRepository extends JpaRepository<Projeto, Long>{
    Optional<Projeto> findById(Long id);
}
