package mx.edu.utez.Dao;
import mx.edu.utez.Entities.Orden;
import mx.edu.utez.Entities.Platillo;
import mx.edu.utez.EstructurasDeDatos.LinkedList;

import java.util.Random;

public class OrdenDao {
    //Trae la linkedlist de platillo y genera una nueva con platillos aleatorios
    Random random = new Random();
    LinkedList<Platillo> listaCompletaPlatillos;
    LinkedList<Platillo> listaPlatillosAleatorios;

    public void generarPlatillosAleatorios() {
        PlatilloDao platilloDao = new PlatilloDao();

        listaPlatillosAleatorios = new LinkedList<>();
        int cantidadDePlatillos = random.nextInt(3) + 1;
        listaCompletaPlatillos = platilloDao.agregarPlatillos();

        for (int i = 0; i < cantidadDePlatillos; i++) {
            int indiceAleatorio = random.nextInt(listaCompletaPlatillos.size());
            listaPlatillosAleatorios.add(listaCompletaPlatillos.get(indiceAleatorio));
        }

    }
    //Generar orden por cliente
    public Orden generarOrdenCliente(){
        generarPlatillosAleatorios();
        int numOrden = random.nextInt(100) + 1;
        return new Orden(numOrden,listaPlatillosAleatorios);
    }
}
