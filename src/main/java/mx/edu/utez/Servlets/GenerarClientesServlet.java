package mx.edu.utez.Servlets;

import com.google.gson.Gson;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import mx.edu.utez.Dao.ClienteDao;
import mx.edu.utez.Entities.Cliente;

import java.io.IOException;

@WebServlet(name = "GenerarClientesServlet", value = "/GenerarClientesServlet")
public class GenerarClientesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/view/listas.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ClienteDao dao = (ClienteDao) session.getAttribute("dao");
        if (dao == null) {
            dao = new ClienteDao();
            session.setAttribute("dao", dao);
        }

        String action = request.getParameter("action");
        if ("ordenar".equals(action)) {
            dao.generarClientes();
        } else if ("atender".equals(action)) {
            dao.desencolarCliente();
        }

        // Redireccionar a la página principal para actualizar la vista
        response.sendRedirect(request.getContextPath() + "/view/listas.jsp");
    }
}



