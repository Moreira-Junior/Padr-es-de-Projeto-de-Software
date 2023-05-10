package state;

import monitor.MonitorDeEnvio;

public class Preparacao extends State {

    public Preparacao(MonitorDeEnvio monitorDeEnvio) {
        super(monitorDeEnvio);
    }

    @Override
    public void processar() {
        System.out.println("Pedido está sendo preparado para envio!");
        this.monitorDeEnvio.changeState(new Transportado(this.monitorDeEnvio));
    }
}
