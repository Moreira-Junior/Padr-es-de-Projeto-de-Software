package main;

import main.contaEstacionamento.ContaEstacionamento;
import main.contaEstacionamento.ContaEstacionamentoSimpleFactory;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class Estacionamento {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Veiculo veiculo;
    private ContaEstacionamento contaEstacionamento;
    
    public Estacionamento(LocalDateTime entrada, LocalDateTime saida, Veiculo veiculo) {
    	this.entrada = entrada;
    	this.saida = saida;
    	this.veiculo = veiculo;
    }

    public LocalDateTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}

	public LocalDateTime getSaida() {
		return saida;
	}

	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

    public BigDecimal obterTotalAPagar() {
		this.contaEstacionamento = ContaEstacionamentoSimpleFactory.criarContaEstacionamento(this.entrada, this.saida);
        return this.contaEstacionamento.obterValorTotal(this.entrada, this.saida);
    }

}
