package locadora;

public class ClassificacaoNormal implements Classificacao{
    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valorAluguel = 0;
        valorAluguel += 2.0;
        if (diasAlugado > 2) {
            valorAluguel += (diasAlugado - 2) * 1.5;
        }
        return  valorAluguel;
    }

    @Override
    public int getPontosDeAlugadorFrequente() {
        return 1;
    }
}
