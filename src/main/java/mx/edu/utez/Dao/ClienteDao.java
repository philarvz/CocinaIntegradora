package mx.edu.utez.Dao;

import mx.edu.utez.Entities.Cliente;
import mx.edu.utez.Entities.Platillo;
import mx.edu.utez.EstructurasDeDatos.LinkedList;
import mx.edu.utez.EstructurasDeDatos.Queue;

import java.util.Random;

public class ClienteDao {
    Random random = new Random();
    LinkedList<String> nombre = new LinkedList<>();
    OrdenDao dao = new OrdenDao();
    Queue<Cliente> turnoClientes = new Queue<>();

    public void generarNombres(){
        nombre.add("Andrés López");
        nombre.add("Mariana Torres");
        nombre.add("Carlos Hernández");
        nombre.add("Sofía Ramírez");
        nombre.add("Diego Castillo");
        nombre.add("Valeria Pérez");
        nombre.add("Rodrigo Gómez");
        nombre.add("Fernanda Morales");
        nombre.add("Alejandro Ruiz");
        nombre.add("Camila Ortiz");
        nombre.add("Javier Guriérrez");
        nombre.add("Daniela Vargas");
        nombre.add("Santiago Luna");
        nombre.add("Ana Beltrán");
        nombre.add("Mateo Rojas");
    }

    public void generarClientes(){
        generarNombres();
        int nombreAleatorio = random.nextInt(14);
        String nombreCliente = nombre.get(nombreAleatorio);
        Cliente cliente = new Cliente(nombreCliente,dao.generarOrdenCliente());
        turnoClientes.offer(cliente);
        System.out.println(cliente);
    }

    //Generar clientes aleatorios (primero se genera la linkedList, luego se genera la orden y al final se guarda la orden en la cliente)
    //Agregar datos a la cola
    //Obtener e imprimir los datos de la cola (Vaciar la cola)

    public void desencolarCliente() {
        Cliente clienteAtendido = turnoClientes.poll();

        if (clienteAtendido != null) {
            System.out.println("Orden #" + clienteAtendido.getOrden().getId());
            System.out.println("Cliente atendido: " + clienteAtendido.getNombre()  + " \n Platillos:");

            double totalOrden = 0;
            LinkedList<Platillo> platillos = clienteAtendido.getOrden().getPlatillos();
            for (int i = 0; i < platillos.size(); i++) {
                System.out.println(" - "+platillos.get(i).getNombre() + " $" + platillos.get(i).getPrecio());
                System.out.println("    Descripcion: " + platillos.get(i).getDescripcion());
                totalOrden += platillos.get(i).getPrecio();
            }

            System.out.println("Total de la orden: $" + totalOrden);
            System.out.println("--------------------------------");
        } else {
            System.out.println("No hay clientes en la fila");
        }
    }



}
