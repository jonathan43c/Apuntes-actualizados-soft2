package Semana1.Ejercicio3;

public class Main {
    public static void main(String[] args) {
                try {
            Circulo c = new Circulo(10);
            Rectangulo t = new Rectangulo(29,2);
            double a = c.calcularArea();
            double b = t.calcularArea();
            System.out.println("El area del circulo es: " + a);
            System.out.println("El area del circulo es: " + b);
        } catch (Exception e) {
           System.out.println("El error es: " + e.getMessage());
        }
        
    }
}
