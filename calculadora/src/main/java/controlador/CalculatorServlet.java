package controlador;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        String operador = request.getParameter("operador");
        int resultado= 0;

        switch (operador) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "division":
                if (b != 0) {
                resultado = a / b;
                } else {
                    response.getWriter().println("Error: división por cero");
                    return;
                }
                break;
        }

        response.setContentType("text/html");
        response.getWriter().println("<html><body><h2>Resultado</h2><p>El resultado es: " + resultado + "</p></body></html>");
    }
}
