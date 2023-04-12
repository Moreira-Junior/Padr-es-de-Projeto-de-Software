package main.contaEstacionamento;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class ContaVeiculoDiaria implements ContaEstacionamento{

    private final BigDecimal VALOR = BigDecimal.valueOf(26.00);
    @Override
    public BigDecimal obterValorTotal(LocalDateTime entrada, LocalDateTime saida) {
        assert(entrada != null && saida != null);
        long periodoDias = Duration.between(entrada, saida).toDays();
        return VALOR.multiply(new BigDecimal(periodoDias));
    }
}
