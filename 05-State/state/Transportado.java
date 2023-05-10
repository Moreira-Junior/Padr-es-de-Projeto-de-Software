package state;

import monitor.MonitorDeEnvio;

public class Transportado extends State {

    public Transportado(MonitorDeEnvio monitorDeEnvio) {
        super(monitorDeEnvio);
    }

    @Override
    public void processar() {
        System.out.println("O pedido está sendo transportado!");
        this.monitorDeEnvio.changeState(new Entregue(this.monitorDeEnvio));
    }
}
