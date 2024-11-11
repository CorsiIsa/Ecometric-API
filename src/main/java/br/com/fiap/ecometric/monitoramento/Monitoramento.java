package br.com.fiap.ecometric.monitoramento;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "monitoramento")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Monitoramento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDateTime dataEmissao;
    Integer porcentagemDiferenca;
    String melhoriaTotal;
    String stMonitoramento;
    String descricao;
}
