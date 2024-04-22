package fr.chat.application.repositories;

import fr.chat.application.beans.SalonsUtilisateursBean;
import fr.chat.application.entities.Salon;
import fr.chat.application.entities.Utilisateur;
import fr.chat.application.interfaces.ISalonRepository;

import java.util.ArrayList;
import java.util.List;

public class SalonRepositoryFile implements ISalonRepository {

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

}
