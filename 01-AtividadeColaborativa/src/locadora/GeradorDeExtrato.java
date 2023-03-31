package locadora;

public abstract class GeradorDeExtrato {

    public final String gerarExtrato(Cliente cliente){
        System.out.println("Iniciando a geração de extrato");
        String extrato = this.gerarLinhasDoExtrato(cliente);
        System.out.println("Extrato gerado com sucesso");
        return extrato;
    }

    abstract String gerarLinhasDoExtrato(Cliente cliente);
}
