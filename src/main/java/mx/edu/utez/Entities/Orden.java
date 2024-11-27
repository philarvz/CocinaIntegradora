package mx.edu.utez.Entities;

import java.util.List;

public class Orden {
    private long id;
    private List<Platillo> platillos;

    public Orden(long id, List<Platillo> platillos) {
        this.id = id;
        this.platillos = platillos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(List<Platillo> platillos) {
        this.platillos = platillos;
    }
}
