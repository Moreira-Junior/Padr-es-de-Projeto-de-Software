package publisher;

import docente.Docente;
import subscriber.Equipamento;
import subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class BlocoAcademico implements Publisher {
    private List<Docente> docentes;
    private List<Subscriber> subscribers;

    public BlocoAcademico() {
        docentes = new ArrayList<>();
        subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber observador : subscribers) {
            observador.update();
        }
    }

    public void entradaDocente(Docente docente) {
        docentes.add(docente);
        System.out.printf("Docente %s de cartão %s entrou no bloco!%n", docente.getNome(), docente.getRfid());
        boolean equipamentosDesligados = subscribers.stream()
                .filter(Equipamento.class::isInstance)
                .map(Equipamento.class::cast)
                .allMatch(e -> !e.ligado());

        if (equipamentosDesligados) {
            notifySubscribers();
        }
    }

    public void saidaDocente(Docente docente) {
        docentes.remove(docente);
        System.out.printf("Docente %s de cartão %s saiu no bloco!%n", docente.getNome(), docente.getRfid());

        if (docentes.isEmpty()) {
            notifySubscribers();
        }
    }
}
