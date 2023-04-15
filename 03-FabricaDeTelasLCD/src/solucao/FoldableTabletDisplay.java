package solucao;

public class FoldableTabletDisplay implements TabletDisplay{

    private double inches;
    protected String features = null;

    public FoldableTabletDisplay(double inches, String features) {
        this.inches = inches;
        this.features = features;
    }

    public double getInches() {
        return inches;
    }

    @Override
    public void assemble() {
        System.out.println("Montando FOLDABLE DISPLAY para TABLET");
        features = getInches() + "\" SUPER FOLDABLE DISPLAY";
    }

    public String toString() {
        return features;
    }
}
