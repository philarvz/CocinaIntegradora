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

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%String context = request.getContextPath();%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Pilares's Kitchen</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            background-color: #f8f9fa;
        }
        .order-card {
            border: 2px dashed #6c757d;
            background-color: #ffffff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .order-card .card-title {
            color: #495057;
            font-weight: bold;
        }
        .order-card .list-group-item {
            font-family: 'Courier New', Courier, monospace;
            color: #212529;
        }
        .order-total {
            font-weight: bold;
            color: #198754;
        }
        .card-body {
            border-bottom: 3px solid #333;
            padding-bottom: 10px;
        }
    </style>
</head>
<body>

<div class="container mt-4">
    <div class="row">
        <div class="col text-center">
            <h3>Pilares's Kitchen Orders</h3>
        </div>
    </div>
    <div class="row mt-3 d-flex justify-content-center" id="ordersContainer">
        <%-- Loop through orders --%>
        <%
            Queue<Cliente> cola = dao.getCola();
            for (int i = 0; i < cola.size(); i++) {
                Cliente cliente = cola.get(i);
        %>
        <div class="card order-card m-2" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">Order #: <%= cliente.getOrden().getId() %></h5>
                <p class="card-text">Customer: <%= cliente.getNombre() %></p>
                <ul class="list-group list-group-flush">
                    <% for (int j = 0; j < cliente.getOrden().getPlatillos().size(); j++) { %>
                    <li class="list-group-item"><%= cliente.getOrden().getPlatillos().get(j).toString() %></li>
                    <% } %>
                </ul>
                <h6 class="order-total mt-2">Total: $<%= cliente.getOrden().getTotal() %></h6>
            </div>
        </div>
        <% } %>
    </div>

    <div class="row mt-4">
        <div class="col text-center">
            <form method="POST" action="<%= context %>/GenerarClientesServlet" style="display: inline;">
                <button id="ordenarButton" type="submit" name="action" value="ordenar" class="btn btn-outline-success btn-lg">ORDENAR</button>
            </form>
            <button id="atenderButton" class="btn btn-outline-danger btn-lg" onclick="atender()">ATENDER</button>
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
                const response = await fetch('<%= context %>/AtenderClientesServlet', { method: 'POST' });
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

