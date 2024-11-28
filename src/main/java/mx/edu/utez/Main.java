package mx.edu.utez;

import mx.edu.utez.Dao.ClienteDao;
import mx.edu.utez.Dao.OrdenDao;

public class Main {
    public static void main(String[] args) {
        ClienteDao dao = new ClienteDao();
        dao.generarClientes();
    }
}
