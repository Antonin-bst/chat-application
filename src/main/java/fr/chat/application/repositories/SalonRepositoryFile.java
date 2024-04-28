package fr.chat.application.repositories;

import fr.chat.application.beans.DataBean;
import fr.chat.application.beans.SalonsUtilisateursBean;
import fr.chat.application.entities.Salon;
import fr.chat.application.entities.Utilisateur;
import fr.chat.application.interfaces.ISalonRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalonRepositoryFile implements ISalonRepository {

    String utilisateursCheminCSV;
    String salonsUtilisateursCheminCSV;
    String salonsCheminCSV;
    DataBean data;

    public SalonRepositoryFile(String _utilisateursCheminCSV, String _salonsUtilisateursCheminCSV, String _salonsCheminCSV) {
        utilisateursCheminCSV = _utilisateursCheminCSV;
        salonsUtilisateursCheminCSV = _salonsUtilisateursCheminCSV;
        salonsCheminCSV = _salonsCheminCSV;
        data = new DataBean();
        readSalonFile();
        readUtilisateurFile();
        readSalonsUtilisateursFile();
    }

    @Override
    public List<Salon> getAllSalons() {
        List<String> salons = data.getSalons();
        List<Salon> output = new ArrayList<>();
        for (String item : salons){
            output.add(new Salon(item));
        }
        return output;
    }

    @Override
    public ArrayList<Utilisateur> getAllUtilisateurs() { return data.getUtilisateurs(); }
    @Override
    public ArrayList<SalonsUtilisateursBean> getAllSalonsUtilisateurs() { return data.getSalonsUtilisateurs(); }
    @Override
    public ArrayList<Salon> getUtilisateurSalonsById(int idUtilisateur) { return null; }
    @Override
    public Utilisateur getUtilisateurById(int idUtilisateur) {

        Utilisateur utilisateur = null;
        for (Utilisateur u : getAllUtilisateurs()){
            if (u.getId() == idUtilisateur) {
                utilisateur = u;
                break;
            }
        }

        return utilisateur;
    }

    private void readUtilisateurFile() {

        BufferedReader reader = null;
        ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(utilisateursCheminCSV));
            String line;
            // Ignorer la première ligne
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                String nom = row[0].trim();
                int id = Integer.parseInt(row[1].trim());

                Utilisateur utilisateur = new Utilisateur(nom, id);
                utilisateurs.add(utilisateur);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //data = new DataBean();
        data.setUtilisateurs(utilisateurs);

    }

    private void readSalonsUtilisateursFile() {

        BufferedReader reader = null;
        ArrayList<SalonsUtilisateursBean> salonsUtilisateurs = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(salonsUtilisateursCheminCSV));
            String line;
            // Ignorer la première ligne
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                int id = Integer.parseInt(row[0].trim());
                String salon = row[1].trim();

                SalonsUtilisateursBean salons = new SalonsUtilisateursBean(id, salon);
                salonsUtilisateurs.add(salons);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        data.setSalonsUtilisateurs(salonsUtilisateurs);
    }

    private void readSalonFile() {
        BufferedReader reader = null;
        ArrayList<String> salons = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(salonsCheminCSV));
            String line;
            // Ignorer la première ligne
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                salons.add(String.valueOf(new Salon(line.trim())));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        data.setSalons(salons);
    }
}
