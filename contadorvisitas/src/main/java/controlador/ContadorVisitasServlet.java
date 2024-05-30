package controlador;

import java.io.IOException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ContadorVisitasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ContadorVisitasServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        Integer contadorVisitas = (Integer) context.getAttribute("contadorVisitas");

        if (contadorVisitas == null) {
            contadorVisitas = 0;
        }

        contadorVisitas++;
        context.setAttribute("contadorVisitas", contadorVisitas);

        request.setAttribute("contadorVisitas", contadorVisitas);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
