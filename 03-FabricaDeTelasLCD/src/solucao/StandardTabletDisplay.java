package solucao;

public class StandardTabletDisplay implements TabletDisplay{

    private double inches;
    protected String features = null;

    public double getInches() {
        return inches;
    }

    public StandardTabletDisplay(double inches, String features) {
        this.inches = inches;
        this.features = features;
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display STANDARD de um TABLET");
        features = getInches() + "\" SUPER STANDARD DISPLAY";
    }

    public String toString() {
        return features;
    }
}
