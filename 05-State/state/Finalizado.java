package state;

import monitor.MonitorDeEnvio;

public class Finalizado extends State {
    public Finalizado(MonitorDeEnvio monitorDeEnvio) {
        super(monitorDeEnvio);
    }

    @Override
    public void processar() {
        System.out.println("O pedido foi entregue com sucesso!");
    }
}
