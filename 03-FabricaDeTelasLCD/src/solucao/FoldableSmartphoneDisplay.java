package solucao;

public class FoldableSmartphoneDisplay implements SmartphoneDisplay {

    private double inches;
    protected String features = null;

    public FoldableSmartphoneDisplay(double inches, String features) {
        this.inches = inches;
        this.features = features;
    }

    public double getInches() {
        return inches;
    }

    @Override
    public void assemble() {
        System.out.println("Montando FOLDABLE DISPLAY para SMARTPHONE");
        features = getInches() + "\" SUPER FOLDABLE DISPLAY";
    }

    public String toString() {
        return features;
    }
}
