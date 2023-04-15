package solucao;

public interface DisplayFactory {

    TabletDisplay createTabletDisplay(double inches, String features);
    SmartphoneDisplay createSmartphoneDisplay(double inches, String features);
    void qualityTest(Display display);
}
