package fr.chat.application.beans;

import fr.chat.application.entities.Utilisateur;

import java.util.ArrayList;

public class UtilisateurAvecSalons {

    private Utilisateur utilisateur;
    private ArrayList<String> salons;

    public UtilisateurAvecSalons(Utilisateur utilisateur, ArrayList<String> salons) {
        super();
        this.utilisateur = utilisateur;
        this.salons = salons;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public ArrayList<String> getSalons() {
        return salons;
    }

    public void setSalons(ArrayList<String> salons) {
        this.salons = salons;
    }

    @Override
    public String toString() {
        return "Les salons de " + utilisateur.getNom() + " sont : " + salons;
    }
}
