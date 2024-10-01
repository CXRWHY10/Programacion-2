package Figuras;

public class Rectangulo extends FigurasGeometricas{
    private double base;
    private double altura;
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    double calcularArea() {
        return base * altura;
    }
    double calcularPerimetro() {
        return 2 * (base * altura);
    }
}
