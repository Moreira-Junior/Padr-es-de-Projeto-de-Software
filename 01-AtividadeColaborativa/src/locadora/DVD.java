package locadora;

public class DVD implements Alugavel {

    private String titulo;
    private Classificacao classificacao;

    public DVD(String titulo, Classificacao classificacao) {
        this.titulo = titulo;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public double getValorDoAluguel(int diasAlugada) {
        return classificacao.getValorDoAluguel(diasAlugada);
    }

    @Override
    public int getPontosDeAlugadorFrequente() {
        return classificacao.getPontosDeAlugadorFrequente();
    }

	public Classificacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}
}
