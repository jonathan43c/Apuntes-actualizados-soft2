

public class Main {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(80, 100);
        Triangulo t2 = new Triangulo(12, 15);

        double t1valor = t1.calcularArea();
        double t2valor = t2.calcularArea();

        if (t1valor < t2valor){
            t2.mostrarDatos();
        } else if (t1valor > t2valor){
            t1.mostrarDatos();
        } else {
            System.out.println("Son iguales");
        }

}
}