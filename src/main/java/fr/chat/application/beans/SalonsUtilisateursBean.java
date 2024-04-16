package fr.chat.application.beans;


//Renomer EN Salon
public class SalonsUtilisateursBean {

    private int id;
    private String salon;

    public SalonsUtilisateursBean(int id, String salon) {
        super();
        this.id = id;
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "{id de l'utilisateur : " + id + ", salon : " + salon + "}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }
}
