package locadora;

import java.util.Iterator;

public class GeradordeExtratoHtml extends GeradorDeExtrato{
    @Override
    public String gerarLinhasDoExtrato(Cliente cliente) {
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = cliente.getAlugueis().iterator();
        String resultado = "<H1>Registro de Alugueis de <EM>" + cliente.getNome() +
                "</EM></H1><P>" + fimDeLinha;
        while(alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();
            resultado += aluguel.getAlugavel().getTitulo() + ": R$ " +

                    aluguel.calcularAluguel() + "<BR>"+ fimDeLinha;
        } // while
// adiciona rodapé
        resultado += "<P>Valor total pago: <EM>R$ " + cliente.calcularValorTotal() +
                "</EM>"+ fimDeLinha;
        resultado += "<P>Voce acumulou <EM>" +
                cliente.calcularPontosDeAlugadorFrequente() +
                " pontos </EM> de alugador frequente";
        return resultado;
    }
}
