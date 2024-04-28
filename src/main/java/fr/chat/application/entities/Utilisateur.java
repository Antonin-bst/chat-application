package fr.chat.application.entities;


import java.util.ArrayList;

public class Utilisateur {

    private String nom;
    private int id;
    private ArrayList<String> utilisateurs;
    private ArrayList<String> salons;

    public Utilisateur(String nom, int id) {
        super();
        this.nom = nom;
        this.id = id;
    }

    @Override
    public String toString() {
        return "[" + nom + ", " + id +  " " + salons + "]";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(ArrayList<String> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public ArrayList<String> getSalons() {
        return salons;
    }

    public void setSalons(ArrayList<String> salons) {
        this.salons = salons;
    }
}
