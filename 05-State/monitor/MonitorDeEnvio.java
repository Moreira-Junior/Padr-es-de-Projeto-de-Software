package monitor;

import state.State;

public class MonitorDeEnvio {

    private State state;
    private boolean entregaBemSucedida = false;

    public void changeState(State state){
        this.state = state;
    }

    public void processar(){
        state.processar();
    }

    public boolean getEntregaBemSucedida() {
        return entregaBemSucedida;
    }

    public void setEntregaBemSucedida(boolean entregaBemSucedida) {
        this.entregaBemSucedida = entregaBemSucedida;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
