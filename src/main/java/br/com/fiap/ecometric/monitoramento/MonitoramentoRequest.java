package br.com.fiap.ecometric.monitoramento;

import java.time.LocalDateTime;


public record MonitoramentoRequest(
    LocalDateTime dataEmissao,
    Integer porcentagemDiferenca,
    String melhoriaTotal,
    String stMonitoramento,
    String descricao
) {
    public Monitoramento toModel() {
        return Monitoramento.builder()
               .dataEmissao(LocalDateTime.now())
               .porcentagemDiferenca(porcentagemDiferenca)
               .melhoriaTotal(melhoriaTotal)
               .stMonitoramento(stMonitoramento)
               .descricao(descricao)
               .build();
    }
}
