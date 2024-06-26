import fr.chat.application.entities.Utilisateur;
import fr.chat.application.repositories.RepositoryJson;
import fr.chat.application.services.Service;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UtilisateursTest {

    /*
     * @Exemple de notation
     * When_UtilisateurDemandeSalon_Then_getUtilisateurSalon_ShouldReturn_salons
     *
     * */

    @Test
    public void when_utilisateurDemandeSalon_then_getUtilisateurSalon_shouldReturn_salons() {
        Service salonService = new Service(new RepositoryJson(".\\src\\main\\java\\fr\\chat\\application\\BDD.json"));
        ArrayList<Utilisateur> salonsUtilisateur = salonService.getAllUtilisateurs();
        // Vérifie que l'utilisateur a deux salons
        assertEquals(2, salonsUtilisateur.size());
        // Vérifie que les salons de l'utilisateur sont "FR" et "US"
      //  assertTrue(salonsUtilisateur.contains("FR"));
        //assertTrue(salonsUtilisateur.contains("US"));
    }
}
