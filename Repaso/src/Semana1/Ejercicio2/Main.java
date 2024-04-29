package Semana1.Ejercicio2;
public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(4, "Toyota", "Corolla", 2021);
        Moto moto = new Moto("dsdas", "Honda", "Kawasaki", 2002);
        auto.mostrarDatos();
        System.out.println("-------------------------------------------------");
        moto.mostrarDatos();
    }
}
