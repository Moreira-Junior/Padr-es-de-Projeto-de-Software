package solucao;

public class StandardSmartphoneDisplay implements SmartphoneDisplay {

    private double inches;
    protected String features = null;

    public double getInches() {
        return inches;
    }

    public StandardSmartphoneDisplay(double inches, String features) {
        this.inches = inches;
        this.features = features;
    }

    public void assemble() {
        System.out.println("Montando display STANDARD para SMARTPHONE");
        features = getInches() + "\" SUPER STANDARD DISPLAY";
    }

    public String toString() {
        return features;
    }
}
