package mx.edu.utez.Entities;


import mx.edu.utez.EstructurasDeDatos.LinkedList;

public class Orden {
    private int id;
    private LinkedList<Platillo> platillos;
    private double total;

    public Orden(int id, LinkedList<Platillo> platillos) {
        this.id = id;
        this.platillos = platillos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(LinkedList<Platillo> platillos) {
        this.platillos = platillos;
    }
}
