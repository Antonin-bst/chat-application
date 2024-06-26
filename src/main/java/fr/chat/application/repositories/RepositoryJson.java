package fr.chat.application.repositories;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.chat.application.beans.SalonsUtilisateursBean;
import fr.chat.application.entities.Salon;
import fr.chat.application.entities.Utilisateur;
import fr.chat.application.interfaces.IRepository;
import fr.chat.application.beans.DataBean;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryJson implements IRepository {

    String jsonFilePath;
    DataBean data;

    public RepositoryJson(String _jsonFilePath) {
        jsonFilePath = _jsonFilePath;
        ReadJson();
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
    public ArrayList<Utilisateur> getAllUtilisateurs() {
        return data.getUtilisateurs();
    }

    @Override
    public ArrayList<Salon> getUtilisateurSalonsById(int idUtilisateur) {
        return null;
    }

    @Override
    public ArrayList<SalonsUtilisateursBean> getAllSalonsUtilisateurs() {
        return data.getSalonsUtilisateurs();
    }

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


    private void ReadJson(){
        try (FileReader reader = new FileReader(jsonFilePath)) {
            Gson gson = new GsonBuilder().create();
            data = gson.fromJson(reader, DataBean.class);

        } catch (IOException e) {
            throw new RuntimeException("Le fichier JSON est introuvable : " + jsonFilePath, e);
        }
    }

}
