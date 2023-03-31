package locadora;

public class ClassificacaoOnline implements Classificacao{
    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valorAluguel = 0;
        if(diasAlugado > 3){
            valorAluguel = 3 * diasAlugado;
        } else {
            valorAluguel = 4 * diasAlugado;
        }
        return valorAluguel;
    }
    @Override
    public int getPontosDeAlugadorFrequente() {
        return 1;
    }
}
