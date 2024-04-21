package fr.chat.application.services;

import fr.chat.application.beans.SalonsUtilisateursBean;
import fr.chat.application.beans.UtilisateurAvecSalons;
import fr.chat.application.entities.Salon;
import fr.chat.application.entities.Utilisateur;
import fr.chat.application.interfaces.InterfaceSalonRepository;

import java.util.*;

//logique, filtrer salon en fonction utilisateur etc.
public class SalonService {

    private final InterfaceSalonRepository _repository;

    public SalonService(InterfaceSalonRepository repository) {
        _repository = repository;
    }

    public List<String> getAllSalons() {
        return getEntityNames(_repository.getAllSalons());
    }

    public ArrayList<Utilisateur> getAllUtilisateurs() {
        return _repository.getAllUtilisateurs();
    }

    public ArrayList<SalonsUtilisateursBean> getAllSalonsUtilisateurs() {
        return _repository.getAllSalonsUtilisateurs();
    }

//TODO: Adapter la méthode pour qu'elle fonctionne. Elle doit retourner les salon associé à l'utilisateur
    public UtilisateurAvecSalons getUtilisateurSalons(int idUtilisateur) {

        // Méthode pour get by id un utilisateur
        Utilisateur utilisateur = null;
        for (Utilisateur u : _repository.getAllUtilisateurs()) {
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
        for (SalonsUtilisateursBean salonUtilisateur : _repository.getAllSalonsUtilisateurs()) {
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
