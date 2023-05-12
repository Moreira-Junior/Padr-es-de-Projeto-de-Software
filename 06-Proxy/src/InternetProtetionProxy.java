import java.util.List;

public class InternetProtetionProxy implements InternetProxy{

    private List<String> blockedSites;

    public InternetProtetionProxy(List<String> blockedSites) {
        this.blockedSites = blockedSites;
    }

    private boolean siteIsBlocked(String site){
        if (this.blockedSites.contains(site)){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if(siteIsBlocked(serverhost)){
            System.out.println("Conectando a "+ serverhost + " ... OK");
        } else {
            System.out.println("Não conectou ao "+ serverhost + " ... ACESSO NEGADO");
        }
    }
}
