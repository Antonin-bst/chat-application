package fr.chat.application.services;

import fr.chat.application.beans.SalonsUtilisateursBean;
import fr.chat.application.beans.UtilisateurAvecSalons;
import fr.chat.application.entities.Salon;
import fr.chat.application.entities.Utilisateur;
import fr.chat.application.interfaces.ISalonRepository;

import java.util.*;

//logique, filtrer salon en fonction utilisateur etc.
public class SalonService {

    private final ISalonRepository _salonRepository;

    public SalonService(ISalonRepository salonRepository) {
        _salonRepository = salonRepository;
    }

    public List<String> getAllSalons() {
        return getEntityNames(_salonRepository.getAllSalons());
    }

    public ArrayList<Utilisateur> getAllUtilisateurs() {
        return _salonRepository.getAllUtilisateurs();
    }

    public ArrayList<SalonsUtilisateursBean> getAllSalonsUtilisateurs() {
        return _salonRepository.getAllSalonsUtilisateurs();
    }

    //TODO: Adapter la méthode pour qu'elle fonctionne. Elle doit retourner les salon associé à l'utilisateur
    public UtilisateurAvecSalons getUtilisateurSalons(int idUtilisateur) {


        //déplacer dans le répository en ajoutant une méthode 
        //      _utilisateurRepository.getbyId()

        // Méthode pour get by id un utilisateur
        Utilisateur utilisateur = null;
        for (Utilisateur u : _salonRepository.getAllUtilisateurs()) {
            if (u.getId() == idUtilisateur) {
                utilisateur = u;
                break;
            }
        }

        if (utilisateur == null) {
            return null;
        }

        // Récupérer les salons associés à cet utilisateur
        ArrayList<String> salonsDeUtilisateur = new ArrayList<>();
        for (SalonsUtilisateursBean salonUtilisateur : _salonRepository.getAllSalonsUtilisateurs()) {
            if (salonUtilisateur.getId() == idUtilisateur) {
                salonsDeUtilisateur.add(salonUtilisateur.getSalon());
            }
        }

        UtilisateurAvecSalons utilisateurAvecSalons;
        utilisateurAvecSalons = new UtilisateurAvecSalons(utilisateur, salonsDeUtilisateur);

        return utilisateurAvecSalons;
    }


    private List<String> getEntityNames(List<Salon> entities) {
        List<String> names = new ArrayList<>();
        for (Salon entity : entities) {
            names.add(entity.getName());
        }
        return names;
    }


}
