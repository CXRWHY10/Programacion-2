package Figuras;

class Circulo extends FigurasGeometricas{
    private double radio;
    public Circulo (double radio){
        this.radio = radio;
    }
    double calcularArea() {
        return Math.PI * radio * radio;
    }
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
