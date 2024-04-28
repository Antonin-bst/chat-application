package fr.chat.application.interfaces;
import fr.chat.application.beans.SalonsUtilisateursBean;
import fr.chat.application.entities.Salon;
import fr.chat.application.entities.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public interface ISalonRepository {
        List<Salon> getAllSalons();
        ArrayList<Utilisateur> getAllUtilisateurs();
        ArrayList<Salon> getUtilisateurSalonsById(int idUtilisateur);
        ArrayList<SalonsUtilisateursBean> getAllSalonsUtilisateurs();
        Utilisateur getUtilisateurById(int idUtilisateur);
}