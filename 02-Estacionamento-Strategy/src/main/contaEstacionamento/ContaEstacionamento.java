package main.contaEstacionamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface ContaEstacionamento {

    BigDecimal obterValorTotal(LocalDateTime inicio, LocalDateTime fim);
}
