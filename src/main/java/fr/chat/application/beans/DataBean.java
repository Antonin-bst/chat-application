package fr.chat.application.beans;

import java.util.ArrayList;
import java.util.List;

public class DataBean {
    List<String> salons;
    ArrayList<String> utilisateurs;

    public List<String> getSalons() {
        return salons;
    }

    public void setSalons(List<String> salons) {
        this.salons = salons;
    }

    public ArrayList<String> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(ArrayList<String> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}
