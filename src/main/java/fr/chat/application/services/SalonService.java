package fr.chat.application.services;

import fr.chat.application.entities.Salon;
import fr.chat.application.entities.Utilisateur;
import fr.chat.application.interfaces.InterfaceSalonRepository;

import java.util.ArrayList;
import java.util.List;

//logique, filtrer salon en fonction utilisateur etc.
public class SalonService {

    private final InterfaceSalonRepository _repository;

    public SalonService(InterfaceSalonRepository repository) {
        _repository = repository;
    }


    public static List<String> getEntityNames(List<Salon> entities) {
        List<String> names = new ArrayList<>();
        for (Salon entity : entities) {
            names.add(entity.getName());
        }
        return names;
    }

    public List<String> getAllSalons() {
        return getEntityNames(_repository.getAllSalons());
    }

    public ArrayList<Utilisateur> getAllUtilisateurs() {
        return _repository.getAllUtilisateurs();
    }

//    public ArrayList<String> getUtilisateurSalons(int id) {
//        ArrayList<String> salonsDeUtilisateur = new ArrayList<>();
//        for (Salon salon : _repository.getUtilisateurSalons(id)) {
//            if (salon.getId() == id) {
//                salonsDeUtilisateur.add(us.getSalon());
//            }
//        }
//        return salonsDeUtilisateur;
//    }

}
