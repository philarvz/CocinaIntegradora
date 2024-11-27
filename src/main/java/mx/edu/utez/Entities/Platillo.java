package mx.edu.utez.Entities;

public class Platillo {
    private String nombre;
    private double precio;
    private String descripcion;

    public Platillo() {
    }

    public Platillo(String descripcion, double precio, String nombre) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
