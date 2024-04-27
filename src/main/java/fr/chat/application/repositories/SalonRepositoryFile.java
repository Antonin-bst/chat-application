package fr.chat.application.repositories;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.chat.application.beans.DataBean;
import fr.chat.application.beans.SalonsUtilisateursBean;
import fr.chat.application.entities.Salon;
import fr.chat.application.entities.Utilisateur;
import fr.chat.application.interfaces.InterfaceSalonRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalonRepositoryFile implements InterfaceSalonRepository {

    String csvFilePath;
    DataBean data;

    public SalonRepositoryFile(String _csvFilePath) {
        csvFilePath = _csvFilePath;
        ReadFile();
    }
    @Override
    public List<Salon> getAllSalons() {
        return null;
    }
    @Override
    public ArrayList<Utilisateur> getAllUtilisateurs() { return null; }
    @Override
    public ArrayList<Salon> getUtilisateurSalons(int idUtilisateur) { return null; }
    @Override
    public ArrayList<SalonsUtilisateursBean> getAllSalonsUtilisateurs() { return null; }

    private void ReadFile(){

        BufferedReader reader = null;
        ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(csvFilePath));
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
            assert reader != null;
            //reader.close();
        }


//        try (FileReader reader = new FileReader(csvFilePath)) {
//            Gson gson = new GsonBuilder().create();
//            data = gson.fromJson(reader, DataBean.class);
//
//        } catch (IOException e) {
//            throw new RuntimeException("Le fichier CSV est introuvable : " + csvFilePath, e);
//        }
    }
}
