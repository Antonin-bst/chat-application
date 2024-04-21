package fr.chat.application.beans;

import java.util.ArrayList;
import java.util.List;

import fr.chat.application.entities.Utilisateur;

public class DataBean {
    List<String> salons;
    ArrayList<Utilisateur> utilisateurs;
    ArrayList<SalonsUtilisateursBean> salonsUtilisateurs;

    public ArrayList<SalonsUtilisateursBean> getSalonsUtilisateurs() {
        return salonsUtilisateurs;
    }

    public void setSalonsUtilisateurs(ArrayList<SalonsUtilisateursBean> salonsUtilisateurs) {
        this.salonsUtilisateurs = salonsUtilisateurs;
    }

    public List<String> getSalons() {
        return salons;
    }

    public void setSalons(List<String> salons) {
        this.salons = salons;
    }

    public ArrayList<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(ArrayList<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}
