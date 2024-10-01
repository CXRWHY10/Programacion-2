package Figuras;

public class TrianguloRectangulo extends  Triangulo{
    public TrianguloRectangulo(double base, double altura, double lado1, double lado2, double lado3) {
        super(base, altura, base, Math.sqrt(base * base + altura * altura), altura);
    }
}
