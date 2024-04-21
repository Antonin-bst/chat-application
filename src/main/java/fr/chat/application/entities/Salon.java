package fr.chat.application.entities;

public class Salon {

    private String name;

    public Salon(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
