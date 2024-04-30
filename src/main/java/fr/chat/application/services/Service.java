package fr.chat.application.services;

import fr.chat.application.beans.SalonsUtilisateursBean;
import fr.chat.application.entities.Salon;
import fr.chat.application.entities.Utilisateur;
import fr.chat.application.interfaces.IRepository;

import java.util.*;

//logique, filtrer salon en fonction utilisateur etc.
public class Service {

    private final IRepository _salonRepository;

    public Service(IRepository salonRepository) {
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

    public Utilisateur getUtilisateurById(int idUtilisateur) {
        return _salonRepository.getUtilisateurById(idUtilisateur);
    }

    public Utilisateur getUtilisateurSalonsById(int idUtilisateur) {

        Utilisateur utilisateur = _salonRepository.getUtilisateurById(idUtilisateur);

        if (utilisateur == null) {
            return null;
        }

        ArrayList<String> salonsDeUtilisateur = new ArrayList<>();
        for (SalonsUtilisateursBean salonUtilisateur : _salonRepository.getAllSalonsUtilisateurs()) {
            if (salonUtilisateur.getId() == idUtilisateur) {
                salonsDeUtilisateur.add(salonUtilisateur.getSalon());
            }
        }

        utilisateur.setSalons(salonsDeUtilisateur);

        return utilisateur;
    }


    private List<String> getEntityNames(List<Salon> entities) {
        List<String> names = new ArrayList<>();
        for (Salon entity : entities) {
            names.add(entity.getName());
        }
        return names;
    }


}
