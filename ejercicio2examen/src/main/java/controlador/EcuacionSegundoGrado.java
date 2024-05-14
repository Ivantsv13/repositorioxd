package controlador;

public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] resolver() {
        double discriminante = b * b - 4 * a * c;
        if (discriminante >= 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return new double[]{x1, x2}; // Raíces reales
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            return new double[]{parteReal, parteImaginaria, parteReal, -parteImaginaria}; // Raíces complejas
        }
    }
}
