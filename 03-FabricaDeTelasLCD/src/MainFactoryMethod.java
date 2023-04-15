import solucao.*;
import solucao.Display;
import solucao.StandardDisplayFactory;

public class MainFactoryMethod {

    public static void main(String[] args) {

        DisplayFactory displayFactory = null;
        displayFactory = new StandardDisplayFactory();
        Display display = displayFactory.createTabletDisplay(6, "Samsung");
        System.out.println(display);

        display = displayFactory.createSmartphoneDisplay(6, "Xiaomi Redmi note 11");
        System.out.println(display);

        displayFactory = new FoldableDisplayFactory();
        display = displayFactory.createTabletDisplay(5, "Algo");
        System.out.println(display);

        displayFactory = new FoldableDisplayFactory();
        display = displayFactory.createSmartphoneDisplay(6.5, "Xiaomi");
        System.out.println(display);

    }
}
