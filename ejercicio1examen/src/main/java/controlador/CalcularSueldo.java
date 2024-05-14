package controlador;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalcularSueldo")
public class CalcularSueldo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        double SueldoDiario = Double.parseDouble(request.getParameter("sueldoDiario"));
        int DiasTrabajados = Integer.parseInt(request.getParameter("diasTrabajados"));
        double SueldoTotal = CalculadorSueldo.calcularSueldoTotal(SueldoDiario, DiasTrabajados);

        request.setAttribute("SueldoTotal", SueldoTotal);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}

