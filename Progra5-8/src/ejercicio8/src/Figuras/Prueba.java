package Figuras;
public class Prueba {
    public static void main(String[]args){
        FigurasGeometricas circulo = new Circulo(5);
        System.out.println("---------CIRCULO---------");
        System.out.println("Area del Circulo -->  "+ circulo.calcularArea());
        System.out.println("Perimetro del Circulo -->  "+ circulo.calcularPerimetro());
        FigurasGeometricas rectangulo = new Rectangulo(6,8);
        System.out.println("---------RECTANGULO---------");
        System.out.println("Area del Rectangulo -->  "+ rectangulo.calcularArea());
        System.out.println("Perimetro del Rectangulo -->  "+ rectangulo.calcularPerimetro());
        FigurasGeometricas cuadrado = new Cuadrado(8);
        System.out.println("---------CUADRADO---------");
        System.out.println("Area del Cuadrado -->  "+ cuadrado.calcularArea());
        System.out.println("Perimetro Cuadrado -->  "+ cuadrado.calcularPerimetro());
        FigurasGeometricas triangulo = new Triangulo(3,4,3,4,5);
        System.out.println("---------TRIANGULO---------");
        System.out.println("Area del Triangulo -->  "+ triangulo.calcularArea());
        System.out.println("Perimetro del Triangulo -->  "+ triangulo.calcularPerimetro());
        FigurasGeometricas triangulorectangulo = new TrianguloRectangulo(6,4,3,3,3);
        System.out.println("---------TRIANGULO RECTANGULO---------");
        System.out.println("Area del Triangulo Rectangulo -->  "+ triangulorectangulo.calcularArea());
        System.out.println("Perimetro del Triangulo Rectangulo -->  "+ triangulorectangulo.calcularPerimetro());
    }
}
