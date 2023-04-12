package main.contaEstacionamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ContaVeiculoMensal implements ContaEstacionamento{
    private final BigDecimal VALOR = BigDecimal.valueOf(300.00);
    @Override
    public BigDecimal obterValorTotal(LocalDateTime entrada, LocalDateTime saida) {
        assert(entrada != null && saida != null);
        return VALOR;
    }
}
