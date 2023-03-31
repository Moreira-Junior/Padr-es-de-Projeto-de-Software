package locadora;

public class ClassificacaoLancamento implements Classificacao{
    @Override
    public double getValorDoAluguel(int diasAlugado) {
        return (diasAlugado*3);
    }

    @Override
    public int getPontosDeAlugadorFrequente() {
        return 2;
    }
}
