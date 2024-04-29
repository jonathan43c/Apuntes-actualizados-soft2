package Semana3.Factory.Incorrecto;

public class Tienda {

    public Producto crearProducto(String tipo) {
        if (tipo.equals("electronico")) {
            return new Producto("Smartphone", 500.0, 10.0);
        } else if (tipo.equals("ropa")) {
            return new Producto("Camisa", 30.0, 5.0);
        } else {
            return null;
        }
    }
}
