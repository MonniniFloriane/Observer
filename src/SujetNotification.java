import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class SujetNotification implements Subject {
    private String message;
    private List<Utilisateur> utilisateurs;

    public SujetNotification() {
        this.utilisateurs = new ArrayList<Utilisateur>();
    }

    public void ajouterAbonne(Utilisateur utilisateur) {
        this.utilisateurs.add(utilisateur);
    }

    public void supprimerAbonne(Utilisateur utilisateur) {
        this.utilisateurs.remove(utilisateur);
    }

    public void publieNotification(String message) {
        for (Utilisateur utilisateur : utilisateurs) {
            this.utilisateurs.update(message);
        }
    }
}
