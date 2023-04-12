package main.contaEstacionamento;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class ContaVeiculoHora implements ContaEstacionamento{
    private final BigDecimal VALOR = BigDecimal.valueOf(2.00);
    @Override
    public BigDecimal obterValorTotal(LocalDateTime entrada, LocalDateTime saida) {
        assert(entrada != null && saida != null);
        long periodoHoras = Duration.between(entrada, saida).toHours();
        return VALOR.multiply(new BigDecimal(periodoHoras));
    }
}
