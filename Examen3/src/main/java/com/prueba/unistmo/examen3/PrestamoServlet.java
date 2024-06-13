package com.prueba.unistmo.examen3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/prestamo")
public class PrestamoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double cantidad = Double.parseDouble(request.getParameter("cantidad"));
        int plazo = Integer.parseInt(request.getParameter("plazo"));


        CalculadoraPrestamo calculadora = new CalculadoraPrestamo(cantidad, plazo);

        double pagoMensual = calculadora.calcularPagoMensual();

        request.setAttribute("pagoMensual", pagoMensual);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
