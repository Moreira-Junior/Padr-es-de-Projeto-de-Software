import monitor.MonitorDeEnvio;
import state.Preparacao;
import state.State;

public class Main {
    public static void main(String[] args) {
        MonitorDeEnvio monitorDeEnvio = new MonitorDeEnvio();
        State preparacao = new Preparacao(monitorDeEnvio);

        monitorDeEnvio.setState(preparacao);

        System.out.println("Caso em que o cliente rejeita o pedido!");
        monitorDeEnvio.processar();
        monitorDeEnvio.processar();
        monitorDeEnvio.processar();
        monitorDeEnvio.processar();
        System.out.println();
        System.out.println("Caso em que o cliente aceita o pedido!");
        monitorDeEnvio.setEntregaBemSucedida(true);
        monitorDeEnvio.processar();
        monitorDeEnvio.processar();
        monitorDeEnvio.processar();
    }
}
