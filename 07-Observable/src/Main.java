import docente.Docente;
import subscriber.Equipamento;
import publisher.BlocoAcademico;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        BlocoAcademico blocoAcademico = new BlocoAcademico();

        Equipamento arCondicionado = new Equipamento("Ar-condicionado");
        Equipamento lampada = new Equipamento("Lâmpada 1");

        Docente docente1 = new Docente(UUID.randomUUID().toString(), "Alex");
        Docente docente2 = new Docente(UUID.randomUUID().toString(), "Valeria");

        blocoAcademico.addSubscriber(arCondicionado);
        blocoAcademico.addSubscriber(lampada);

        blocoAcademico.entradaDocente(docente1);
        blocoAcademico.entradaDocente(docente2);

        blocoAcademico.saidaDocente(docente1);
        blocoAcademico.saidaDocente(docente2);
    }
}