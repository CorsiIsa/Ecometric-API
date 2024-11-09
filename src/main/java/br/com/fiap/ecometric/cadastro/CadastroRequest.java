package br.com.fiap.ecometric.cadastro;

import java.time.LocalDateTime;

public record CadastroRequest(
    String nomeEmpresa,
    String nrCnpj,
    String incricaoEstadual,
    String razaoSocial,
    String porte,
    String dataAbertura,
    String email,
    String senha,
    String cep,
    String endereco,
    String bairro,
    String estado,
    String contato
) {
    public Cadastro toModel() {
        return Cadastro.builder()
               .nomeEmpresa(nomeEmpresa)
               .nrCnpj(nrCnpj)
               .incricaoEstadual(incricaoEstadual)
               .razaoSocial(razaoSocial)
               .porte(porte)
               .dataAbertura(LocalDateTime.now())
               .email(email)
               .senha(senha)
               .cep(cep)
               .endereco(endereco)
               .bairro(bairro)
               .estado(estado)
               .contato(contato)
               .build();
    }
}

