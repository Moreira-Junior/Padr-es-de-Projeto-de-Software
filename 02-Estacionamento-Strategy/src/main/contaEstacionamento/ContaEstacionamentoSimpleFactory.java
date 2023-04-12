package main.contaEstacionamento;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class ContaEstacionamentoSimpleFactory {

    public static ContaEstacionamento criarContaEstacionamento(LocalDateTime inicio, LocalDateTime fim){
        assert(inicio != null && fim != null);
        long periodoHoras = Duration.between(inicio, fim).toHours();
        long periodoDias = Duration.between(inicio, fim).toDays();

        BigDecimal valor = new BigDecimal(0);
        if (periodoHoras < 12) {
            return new ContaVeiculoHora();
        } else if (periodoHoras > 12 && periodoDias < 15) {
            return new ContaVeiculoDiaria();
        } else if (periodoDias > 15) {
            return new ContaVeiculoMensal();
        }
        return null;
    }
}
