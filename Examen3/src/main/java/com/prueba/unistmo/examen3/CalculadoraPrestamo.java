package com.prueba.unistmo.examen3;

public class CalculadoraPrestamo {
    private double cantidad;
    private int plazo;

    public CalculadoraPrestamo(double cantidad, int plazo) {
        this.cantidad = cantidad;
        this.plazo = plazo;
    }

    public double calcularPagoMensual() {
        // Calcular el pago mensual dividiendo la cantidad total entre el plazo en meses
        double pagoMensual = cantidad / plazo;
        return pagoMensual;
    }
}
