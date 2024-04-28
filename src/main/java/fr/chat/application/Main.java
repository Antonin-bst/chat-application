package fr.chat.application;

import fr.chat.application.repositories.SalonRepositoryFile;
import fr.chat.application.repositories.SalonRepositoryJson;
import fr.chat.application.services.SalonService;
import java.io.IOException;


public class Main  {

    public static void main(String[] args) throws IOException {

        String utilisateursCheminCSV = ".\\src\\main\\java\\fr\\chat\\application\\utilisateurs.csv";
        String salonsUtilisateursCheminCSV = ".\\src\\main\\java\\fr\\chat\\application\\salonsUtilisateurs.csv";

        SalonService salonService = new SalonService(new SalonRepositoryJson(".\\src\\main\\java\\fr\\chat\\application\\BDD.json"));
        SalonService salonServiceFile = new SalonService(new SalonRepositoryFile(utilisateursCheminCSV, salonsUtilisateursCheminCSV));
        //System.out.println(salonService.getUtilisateurSalonsById(2));
        System.out.println(salonServiceFile.getAllSalonsUtilisateurs());
        System.out.println(salonServiceFile.getAllUtilisateurs());
    }

}