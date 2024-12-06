<%@ page import="mx.edu.utez.Entities.Cliente" %>
<%@ page import="mx.edu.utez.Dao.ClienteDao" %>
<%@ page import="mx.edu.utez.EstructurasDeDatos.Queue" %>
<%@ page import="mx.edu.utez.Entities.Platillo" %>
<%
    ClienteDao dao = (ClienteDao) session.getAttribute("dao");
    if (dao == null) {
        dao = new ClienteDao();
        session.setAttribute("dao", dao);
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pilares's Kitchen</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-4">
    <div class="row">
        <div class="col text-center">
            <h3>Lista de Órdenes</h3>
        </div>
    </div>
    <div class="row mt-3 d-flex justify-content-center" id="ordersContainer">
        <%
            Queue<Cliente> cola = dao.getCola();
            for (int i = 0; i < cola.size(); i++) {
                Cliente cliente = cola.get(i);
        %>
        <div class="card m-2" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">Orden ID: <%= cliente.getOrden().getId() %></h5>
                <p class="card-text">Cliente: <%= cliente.getNombre() %></p>
                <ul class="list-group list-group-flush">
                    <%
                        for (int j = 0; j < cliente.getOrden().getPlatillos().size(); j++) {
                            Platillo platillo = cliente.getOrden().getPlatillos().get(j);
                    %>
                    <li class="list-group-item"><%= platillo.toString() %></li>
                    <% } %>
                </ul>
                <h6 class="mt-2">Total: $<%= cliente.getOrden().getTotal() %></h6>
            </div>
        </div>
        <% } %>
    </div>

    <div class="row mt-4">
        <div class="col text-center">
            <form method="POST" action="<%= request.getContextPath() %>/GenerarClientesServlet" style="display: inline;">
                <button id="ordenarButton" type="submit" name="action" value="ordenar" class="btn btn-success">ORDENAR</button>
            </form>
            <button id="atenderButton" class="btn btn-danger" onclick="atender()">ATENDER</button>
        </div>
    </div>
</div>

<script>
    async function atender() {
        document.getElementById('ordenarButton').disabled = true;
        const interval = setInterval(async () => {
            const currentOrders = document.querySelectorAll('#ordersContainer .card');

            if (currentOrders.length === 0) {
                clearInterval(interval);
                document.getElementById('ordenarButton').disabled = false;
            } else {
                const response = await fetch('<%= request.getContextPath() %>/AtenderClientesServlet', { method: 'POST' });
                if (response.ok) {
                    const atendido = await response.json();
                    currentOrders[0].remove();
                } else {
                    clearInterval(interval);
                }
            }
        }, 1000);
    }
</script>

</body>
</html>
