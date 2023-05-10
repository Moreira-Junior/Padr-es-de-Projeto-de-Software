package state;

import monitor.MonitorDeEnvio;

public abstract class State {

    protected MonitorDeEnvio monitorDeEnvio;

    public State(MonitorDeEnvio monitorDeEnvio){
        this.monitorDeEnvio = monitorDeEnvio;
    }

    public abstract void processar();

}
