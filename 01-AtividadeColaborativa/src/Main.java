//********** import para executar o código conforme modificações da lista01.2.1-GRASP-refactoring
import locadora.*;
//********** import para executar o código conforme modificações da lista01.2.2-GRASP-refactoring
//import refactoring1.Cliente;
//************************************************************************************************
//********** import para executar o código conforme modificações da lista01.2.3-GRASP-refactoring
//import refactoring2.Cliente;
//import refactoring2.Aluguel;
//************************************************************************************************


public class Main {
	public static void main(String[] args) {
		GeradorDeExtrato geradordeExtratoHtml = new GeradordeExtratoHtml();
		GeradorDeExtrato geradordeExtratoNormal = new GeradordeExtratoNormal();

		Locadora locadora = new Locadora(geradordeExtratoHtml);
		Cliente c1 = new Cliente("Alex* Sandro");
		c1.adicionarAluguel(new Aluguel(new DVD("O Atirador", ClassificacaoFactory.criarClassificacao(TipoClassificacao.NORMAL)), 10));
		c1.adicionarAluguel(new Aluguel(new DVD("Luca", ClassificacaoFactory.criarClassificacao(TipoClassificacao.INFANTIL)), 2));
		c1.adicionarAluguel(new Aluguel(new DVD("O Gato de Botas 2", ClassificacaoFactory.criarClassificacao(TipoClassificacao.LANCAMENTO)), 30));
		c1.adicionarAluguel(new Aluguel(new DVD("Arremessando Alto", ClassificacaoFactory.criarClassificacao(TipoClassificacao.LANCAMENTO)), 4));
		c1.adicionarAluguel(new Aluguel(new DVD("Moana", ClassificacaoFactory.criarClassificacao(TipoClassificacao.INFANTIL)), 10));
		c1.adicionarAluguel(new Aluguel(new DVD("Uma Noite no Museu", ClassificacaoFactory.criarClassificacao(TipoClassificacao.NORMAL)), 3));
		c1.adicionarAluguel(new Aluguel(new Jogo("Civilization VI", "PC", ClassificacaoFactory.criarClassificacao(TipoClassificacao.ONLINE)), 4));
		c1.adicionarAluguel(new Aluguel(new Jogo("FIFA", "Ps5", ClassificacaoFactory.criarClassificacao(TipoClassificacao.ONLINE)), 2));

		locadora.adicionarCliente(c1);

		System.out.println(locadora.gerarExtratoPorNomeDoCliente("Alex* Sandro"));
	}
}
