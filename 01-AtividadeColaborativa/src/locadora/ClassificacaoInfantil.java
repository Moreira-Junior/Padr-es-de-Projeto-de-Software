package locadora;

public class ClassificacaoInfantil implements Classificacao{

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valorAluguel = 0;
        valorAluguel += 1.5;
        if (diasAlugado > 3) {
            valorAluguel += (diasAlugado - 3) * 1.5;
        }
        return valorAluguel;
    }

    @Override
    public int getPontosDeAlugadorFrequente() {
        return 1;
    }
}
