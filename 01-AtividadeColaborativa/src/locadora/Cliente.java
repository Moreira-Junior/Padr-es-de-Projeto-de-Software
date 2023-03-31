package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Aluguel> alugueis = new ArrayList<>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Aluguel> getAlugueis(){
		return this.alugueis;
	}

	public void adicionarAluguel(Aluguel aluguel) {
		alugueis.add(aluguel);
	}

	public double calcularValorTotal(){
		double valorTotal = 0;
		Iterator<Aluguel> alugueis = this.alugueis.iterator();
		while(alugueis.hasNext()) {
			Aluguel aluguel = alugueis.next();
			//switch
			double valorAluguel = aluguel.calcularAluguel();
			valorTotal += valorAluguel;
		} // while
		return valorTotal;
	}

	public int calcularPontosDeAlugadorFrequente(){
		int pontosDeAlugadorFrequente = 0;
		Iterator<Aluguel> alugueis = this.alugueis.iterator();
		while(alugueis.hasNext()) {
			Aluguel aluguel = alugueis.next();
			pontosDeAlugadorFrequente += aluguel.calcularPontosDeAluguelFrequente();
		}
		return pontosDeAlugadorFrequente;
	}

}