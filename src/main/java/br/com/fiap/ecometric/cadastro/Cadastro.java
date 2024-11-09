package br.com.fiap.ecometric.cadastro;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cadastro")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cadastro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nomeEmpresa;
    String nrCnpj;
    String incricaoEstadual;
    String razaoSocial;
    String porte;
    LocalDateTime dataAbertura;
    String email;
    String senha;
    String cep;
    String endereco;
    String bairro;
    String estado;
    String contato;
}
