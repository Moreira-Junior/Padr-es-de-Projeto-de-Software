package subscriber;

public class Equipamento implements Subscriber {
    private String nome;
    private boolean ligado;

    public Equipamento(String nome) {
        this.nome = nome;
        ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println(nome + " ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(nome + " desligado.");
    }

    public boolean ligado() {
        return ligado;
    }

    @Override
    public void update() {
        if (ligado) {
            desligar();
        } else {
            ligar();
        }
    }
}