package fr.chat.application.interfaces;
import fr.chat.application.beans.SalonsUtilisateursBean;
import fr.chat.application.entities.Salon;
import fr.chat.application.entities.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public interface ISalonRepository {
        List<Salon> getAllSalons();
        ArrayList<Utilisateur> getAllUtilisateurs();
        ArrayList<Salon> getUtilisateurSalons(int idUtilisateur);
        ArrayList<SalonsUtilisateursBean> getAllSalonsUtilisateurs();
}