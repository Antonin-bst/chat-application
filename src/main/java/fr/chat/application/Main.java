package fr.chat.application;


import fr.chat.application.repositories.SalonRepositoryJson;
import fr.chat.application.services.SalonService;

public class Main  {

    public static void main(String[] args) {

        SalonService salonService = new SalonService(new SalonRepositoryJson("C:\\Users\\antonin.bastide\\Documents\\ProjetPerso\\chat-application\\src\\main\\java\\fr\\chat\\application\\BDD.json"));

        System.out.println("Tous les salons : " + salonService.getAllSalons());
        //System.out.println("Tous les users : " + salonService.getAllUtilisateurs());
        //System.out.println("Les salons de l'utilisateur : " + salonService.(1));



//        // Create an instance of SalonService
//        SalonService salonService = new SalonService(new SalonRepositoryJson());
//        // Call getAllSalons() from SalonService to retrieve the list of salons
//        List<Salon> salons = salonService.getAllSalons();
//        ArrayList<String> salonsUtilisateur = salonService.getUtilisateurSalons("quentin");
//
//        // Afficher les salons de l'utilisateur
//        System.out.println("Salons de l'utilisateur " + "quentin" + ":");
//        for (String salon : salonsUtilisateur) {
//            System.out.println(salon);
//        }

       /*
        for (Salon salon : salons) {
            System.out.println("Nom: " + salon.getNom() + ", ID: " + salon.getId());
        }
        */

        String nomUtilisateur = "quentin";

        // Call getUtilisateurSalons method to retrieve the list of Utilisateurs with their salon information
//        List<Utilisateur> utilisateurs = salonService.getUtilisateurSalons(nomUtilisateur);
//
//        System.out.println(utilisateurs);


    }



}