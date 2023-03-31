package locadora;

public interface Alugavel {

    public String getTitulo();
    public double getValorDoAluguel(int diasAlugada);
    public int getPontosDeAlugadorFrequente();
}
