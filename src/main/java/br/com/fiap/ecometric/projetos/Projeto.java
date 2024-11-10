package br.com.fiap.ecometric.projetos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "projetos")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String descricaoIdeia;
    String pontosMelhorias;
    String pontosPrincipais;
    String porcentagemMelhoria;
}
