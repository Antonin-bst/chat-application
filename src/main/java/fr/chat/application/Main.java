package fr.chat.application;


import fr.chat.application.entities.Salon;
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
import java.util.Arrays;
import java.util.List;

public class Main  {

    public static void main(String[] args) throws IOException {

        SalonService salonService = new SalonService(new SalonRepositoryJson(".\\src\\main\\java\\fr\\chat\\application\\BDD.json"));
        SalonService salonServiceFile = new SalonService(new SalonRepositoryFile(".\\src\\main\\java\\fr\\chat\\application\\utilisateurs.csv"));
        //System.out.println(salonService.getUtilisateurSalonsById(2));
        System.out.println(salonServiceFile.getAllUtilisateurs());

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("\".\\\\src\\\\main\\\\java\\\\fr\\\\chat\\\\application\\\\utilisateurs.csv\""))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        }
        System.out.println(records);
    }



}