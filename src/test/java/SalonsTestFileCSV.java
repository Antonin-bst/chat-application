
import fr.chat.application.entities.Utilisateur;
import fr.chat.application.repositories.RepositoryFile;
import fr.chat.application.services.Service;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SalonsTestFileCSV {

    String utilisateursCheminCSV = ".\\src\\main\\java\\fr\\chat\\application\\utilisateurs.csv";
    String salonsUtilisateursCheminCSV = ".\\src\\main\\java\\fr\\chat\\application\\salonsUtilisateurs.csv";
    String salonsCheminCSV = ".\\src\\main\\java\\fr\\chat\\application\\salons.csv";
    Service service = new Service(new RepositoryFile(utilisateursCheminCSV, salonsUtilisateursCheminCSV, salonsCheminCSV));

    /*
     * @Exemple de notation
     * When_UtilisateurDemandeSalon_Then_getUtilisateurSalon_ShouldReturn_salons
     *
     * */

    @Test
    public void when_utilisateurDemandeLesSalons_then_getAllSalonsUtilisateurs_shouldReturn_salons() {

        ArrayList<Utilisateur> utilisateurs = service.getAllUtilisateurs();
        System.out.println(service.getAllSalonsUtilisateurs());

        assertNotNull(utilisateurs);
        assertEquals(3, utilisateurs.size());
    }

    @Test
    public void when_utilisateurDemandeSalon_then_getAllSalons_shouldReturn_leNomDesSalons() {

        List<String> nomsDesSalons = service.getAllSalons();
        System.out.println(nomsDesSalons);

        assertNotNull(nomsDesSalons);
        assertEquals(3, nomsDesSalons.size());
        assertTrue(nomsDesSalons.contains("FR"));
        assertTrue(nomsDesSalons.contains("US"));
        assertTrue(nomsDesSalons.contains("UK"));
    }
}
