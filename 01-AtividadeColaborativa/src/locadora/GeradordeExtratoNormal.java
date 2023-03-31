package locadora;

import java.util.Iterator;

public class GeradordeExtratoNormal extends GeradorDeExtrato{
    @Override
    public String gerarLinhasDoExtrato(Cliente cliente) {
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = cliente.getAlugueis().iterator();
        String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;

        while(alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();
            resultado += "\t" + aluguel.getAlugavel().getTitulo() + "\t R$ " + aluguel.calcularAluguel() + fimDeLinha;
        } // while
        // adiciona rodapé
        resultado += "Valor total pago: R$ " + cliente.calcularValorTotal() + fimDeLinha;
        resultado += "Voce acumulou " + cliente.calcularPontosDeAlugadorFrequente() +
                " pontos de alugador frequente";
        return resultado;
    }
}
