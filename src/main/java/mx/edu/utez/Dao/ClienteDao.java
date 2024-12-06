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

    public Cliente generarClientes(){
        generarNombres();
        int nombreAleatorio = random.nextInt(14);
        String nombreCliente = nombre.get(nombreAleatorio);
        Cliente cliente = new Cliente(nombreCliente,dao.generarOrdenCliente());
        turnoClientes.offer(cliente);
        //System.out.println(cliente);
        double total = 0;
        for(int i = 0; i < cliente.getOrden().getPlatillos().size(); i++){
            total+= cliente.getOrden().getPlatillos().get(i).getPrecio();
        }
        cliente.getOrden().setTotal(total);
        return cliente;
    }

    public Queue<Cliente> getCola(){
        return turnoClientes;
    }

    //Generar clientes aleatorios (primero se genera la linkedList, luego se genera la orden y al final se guarda la orden en la cliente)
    //Agregar datos a la cola
    //Obtener e imprimir los datos de la cola (Vaciar la cola)

    public Cliente desencolarCliente() {
        Cliente clienteAtendido = turnoClientes.poll();
        if (clienteAtendido != null) {
            int segundos = random.nextInt(5) + 1; // Tiempo aleatorio de 1 a 5 segundos
            System.out.println("Atendiendo al cliente: " + clienteAtendido.getNombre());
            pausarPrograma(segundos * 1000);
        }
        return clienteAtendido;
    }

    public static void pausarPrograma(int segundos){
        try{
            Thread.sleep(segundos);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void desencolarClienteAsync() {
        new Thread(() -> {
            Cliente clienteAtendido = turnoClientes.poll();
            if (clienteAtendido != null) {
                int segundos = random.nextInt(10000) + 1000;
                pausarPrograma(segundos);
                // Aquí puedes procesar la orden si es necesario
            }
        }).start();
    }

    public void reiniciarCola() {
        turnoClientes = new Queue<>();
    }
}
