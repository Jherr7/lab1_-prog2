import java.util.Scanner;
public class TestEcuacionLineal {
    static class EcuacionLineal {
        private double a, b, c, d, e, f;
        public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        public boolean tieneSolucion() {
            return (a * d - b * c) != 0;
        }
        public double getX() {
            return (e * d - b * f) / (a * d - b * c);
        }
        public double getY() {
            return (a * f - e * c) / (a * d - b * c);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese a, b, c, d, e, f:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);

        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX());
            System.out.println("y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuación no tiene solución.");
        }

        sc.close();
    }
}
