package locadora;

public class ClassificacaoFactory {
    private ClassificacaoFactory(){

    }
    public static Classificacao criarClassificacao(TipoClassificacao tipoClassificacao){
        if (tipoClassificacao.equals(TipoClassificacao.INFANTIL)) {
            return new ClassificacaoInfantil();
        } else if (tipoClassificacao.equals(TipoClassificacao.NORMAL)) {
            return new ClassificacaoNormal();
        } else if (tipoClassificacao.equals(TipoClassificacao.LANCAMENTO)) {
            return new ClassificacaoLancamento();
        } else if (tipoClassificacao.equals(TipoClassificacao.ONLINE)) {
            return new ClassificacaoOnline();
        } else {
            return new ClassificacaoNullObject();
        }
    }
}
