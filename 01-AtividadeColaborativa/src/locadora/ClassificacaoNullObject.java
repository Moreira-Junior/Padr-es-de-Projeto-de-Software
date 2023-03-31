package locadora;

public class ClassificacaoNullObject implements Classificacao{


    @Override
    public double getValorDoAluguel(int diasAlugado) {
        return 0;
    }

    @Override
    public int getPontosDeAlugadorFrequente() {
        return 0;
    }
}
