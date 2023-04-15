package solucao;

import java.util.concurrent.TimeUnit;

public class StandardDisplayFactory implements DisplayFactory{
    @Override
    public TabletDisplay createTabletDisplay(double inches, String features) {
        TabletDisplay display = new StandardTabletDisplay(inches, features);
        display.assemble();
        this.qualityTest(display);
        return display;
    }

    @Override
    public SmartphoneDisplay createSmartphoneDisplay(double inches, String features) {
        SmartphoneDisplay display = new StandardSmartphoneDisplay(inches, features);
        display.assemble();
        this.qualityTest(display);
        return display;
    }

    @Override
    public void qualityTest(Display display) {
        System.out.print("Teste de Qualidade: ");
        for (int i = 1; i < 4; i++) {
            System.out.print(  "[*] ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" OK (passed)");
    }
}
