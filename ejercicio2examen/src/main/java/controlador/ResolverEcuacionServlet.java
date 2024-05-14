package controlador;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ResolverEcuacion")
public class ResolverEcuacionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double c = Double.parseDouble(request.getParameter("c"));

        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(a, b, c);
        double[] soluciones = ecuacion.resolver();

        if (soluciones.length == 2) {
            request.setAttribute("soluciones", soluciones);
        } else {
            request.setAttribute("solucionesComplejas", soluciones);
        }

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
