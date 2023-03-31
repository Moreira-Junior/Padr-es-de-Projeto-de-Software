package locadora;

public class Jogo implements Alugavel {

    private String titulo;
    private String console;
    private Classificacao classificacao;

    public Jogo(String titulo, String console, Classificacao classificacao) {
        this.titulo = titulo;
        this.console = console;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
}
