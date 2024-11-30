package mx.edu.utez.Entities;

public class Cliente {
    private String nombre;
    private Orden orden;


    public Cliente(String nombre, Orden orden) {
        this.nombre = nombre;
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        StringBuilder platillosStr = new StringBuilder();

        for (int i= 0; i<orden.getPlatillos().size();i++) {
            platillosStr.append(orden.getPlatillos().get(i).toString()).append("\n");
        }

        return "--------------------------------\n"+"Número de orden: " + orden.getId() +"\n"+
                "Cliente: " + nombre +"\n--------------------------------\n"+
                "Platillos: "+ "\n" + platillosStr;
    }
}
