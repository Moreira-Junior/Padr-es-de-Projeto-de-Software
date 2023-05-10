package state;

import monitor.MonitorDeEnvio;

public class Entregue extends State {

    public Entregue(MonitorDeEnvio monitorDeEnvio) {
        super(monitorDeEnvio);
    }

    @Override
    public void processar() {
        System.out.println("O cliente recebeu o pedido!");
        if (this.monitorDeEnvio.getEntregaBemSucedida()){
            this.monitorDeEnvio.changeState(new Finalizado(this.monitorDeEnvio));
        } else {
            this.monitorDeEnvio.changeState(new Preparacao(this.monitorDeEnvio));
        }
    }
}
