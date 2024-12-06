package mx.edu.utez.Servlets;

import com.google.gson.Gson;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import mx.edu.utez.Dao.ClienteDao;
import mx.edu.utez.Entities.Cliente;

import java.io.IOException;

@WebServlet(name = "AtenderClientesServlet", value = "/AtenderClientesServlet")
public class AtenderClientesServlet extends HttpServlet {
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

        Cliente atendido = dao.desencolarCliente();
        response.setContentType("application/json");
        response.getWriter().write(new Gson().toJson(atendido));
    }
}