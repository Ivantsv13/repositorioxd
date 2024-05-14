package controlador;

public class CalculadorSueldo {
    public static double calcularSueldoTotal(double sueldoDiario, int diasTrabajados) {
        
        if (diasTrabajados < 1 || diasTrabajados > 15) {
            throw new IllegalArgumentException("La cantidad de días trabajados debe ser entre 1 y 15");
        }
        return sueldoDiario * diasTrabajados;

    }
}
