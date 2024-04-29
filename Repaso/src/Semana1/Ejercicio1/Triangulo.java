public class Triangulo {
    
    private int base;
    private double altura;

    public Triangulo(int base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        return this.base*this.altura/2;
    }

    public void mostrarDatos(){
        System.out.println("Base: "+this.base);
        System.out.println("Altura: "+this.base);
    }

    

}
