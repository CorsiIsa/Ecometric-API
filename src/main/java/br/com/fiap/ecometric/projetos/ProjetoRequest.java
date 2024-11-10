package br.com.fiap.ecometric.projetos;


public record ProjetoRequest(
    String nome,
    String descricaoIdeia,
    String pontosMelhorias,
    String pontosPrincipais,
    String porcentagemMelhoria
) {
    public Projeto toModel() {
        return Projeto.builder()
                .nome(nome)
                .descricaoIdeia(descricaoIdeia)
                .pontosMelhorias(pontosMelhorias)
                .pontosPrincipais(pontosPrincipais)
                .porcentagemMelhoria(porcentagemMelhoria)
               .build();
    }
}
