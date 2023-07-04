package docente;

public class Docente {

    private String rfid;

    private String nome;

    public Docente(String rfid, String nome) {
        this.rfid = rfid;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }
}
