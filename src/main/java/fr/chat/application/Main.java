package fr.chat.application;


import fr.chat.application.entities.Utilisateur;
import fr.chat.application.repositories.SalonRepositoryFile;
import fr.chat.application.repositories.SalonRepositoryJson;
import fr.chat.application.services.SalonService;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) throws IOException {

        SalonService salonService = new SalonService(new SalonRepositoryJson("C:\\Users\\antonin.bastide\\Documents\\ProjetPerso\\chat-application\\src\\main\\java\\fr\\chat\\application\\BDD.json"));
        salonService.getAllSalons();
        System.out.println( salonService.getAllUtilisateurs());
        System.out.println(salonService.getAllSalons());
        System.out.println(salonService.getAllSalonsUtilisateurs());
        System.out.println(salonService.getUtilisateurSalons(1));

      //  List<String> salons = salonService.getAllSalons();
       // ArrayList<String> salonsUtilisateur = salonService.getSalonDeUtilisateur("quentin");

      /* Afficher les salons de l'utilisateur
        System.out.println("Salons de l'utilisateur " + "quentin" + ":");
        for (String salon : salonsUtilisateur) {
            System.out.println(salon);
        }
        */

        String utilisateursCSV = "C:\\Users\\antonin.bastide\\Documents\\ProjetPerso\\chat-application\\src\\main\\java\\fr\\chat\\application\\utilisateurs.csv";
        var repo = new SalonRepositoryFile(utilisateursCSV);
            var utilisateurs = repo.getAllUtilisateurs();
           System.out.println(utilisateurs);


    }



}