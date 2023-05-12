import java.util.Arrays;
import java.util.List;

public class ClientInternet {
    public static void main (String[] args) {
        List<String> blockedSites = Arrays.asList("www.ifpb.edu.br", "www.google.com");
        InternetProxy internet = new InternetProtetionProxy(blockedSites);
        try {
            internet.connectTo("www.ifpb.edu.br");
            internet.connectTo("www.youtube.com");
            internet.connectTo("www.google.com");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}