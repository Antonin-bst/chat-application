
import fr.chat.application.beans.SalonsUtilisateursBean;
import fr.chat.application.entities.Utilisateur;
import fr.chat.application.repositories.RepositoryFile;
import fr.chat.application.services.Service;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UtilisateursTestFileCSV {

    String utilisateursCheminCSV = ".\\src\\main\\java\\fr\\chat\\application\\utilisateurs.csv";
    String salonsUtilisateursCheminCSV = ".\\src\\main\\java\\fr\\chat\\application\\salonsUtilisateurs.csv";
    String salonsCheminCSV = ".\\src\\main\\java\\fr\\chat\\application\\salons.csv";
    Service salonService = new Service(new RepositoryFile(utilisateursCheminCSV, salonsUtilisateursCheminCSV, salonsCheminCSV));

    /*
     * @Exemple de notation
     * When_UtilisateurDemandeSalon_Then_getUtilisateurSalon_ShouldReturn_salons
     *
     * */

    @Test
    public void when_utilisateurDemandeLesSalons_then_getAllSalonsUtilisateurs_shouldReturn_salons() {

        ArrayList<SalonsUtilisateursBean> salonsDesUtilisateurs = salonService.getAllSalonsUtilisateurs();
        System.out.println(salonsDesUtilisateurs);

        assertNotNull(salonsDesUtilisateurs);
        assertEquals(3, salonsDesUtilisateurs.size());
    }

    @Test
    public void when_utilisateurDemandeSalonsDeUtilisateur_then_getUtilisateurSalonsById_shouldReturn_salons() {
        Utilisateur utilisateur = salonService.getUtilisateurSalonsById(1);
        System.out.println(utilisateur.getSalons());
        assertEquals(2, utilisateur.getSalons().size());
        assertTrue(utilisateur.getSalons().contains("FR"));
        assertTrue(utilisateur.getSalons().contains("US"));

    }

    @Test
    public void when_utilisateurDemandeUtilisateur_then_getUtilisateurById_shouldReturn_utilisateur() {
        Utilisateur utilisateur = salonService.getUtilisateurById(1);
        System.out.println(utilisateur.getNom().toLowerCase());
        assertTrue(utilisateur.getNom().toLowerCase().contains("quentin"));
    }
}
