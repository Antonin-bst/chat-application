package fr.chat.application;


import fr.chat.application.repositories.SalonRepositoryJson;
import fr.chat.application.services.SalonService;

public class Main  {

    public static void main(String[] args) {

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


    }



}