public class RealInternet implements InternetProxy{
    public void connectTo(String serverhost) throws Exception
    {
        System.out.println("Conectando a "+ serverhost + " ... OK");
    }
}