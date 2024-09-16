class Circulo {
        int radio;
        Circulo(int radio){
            this.radio = radio;
        }
        double calcularArea(){
            return Math.PI*Math.pow(radio,2);
        }
        double calcularPerimetro(){
            return 2*Math.PI*radio;
        }
}
class Rectangulo {
    int base;
    int altura;
    Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    double calcularArea(){
        return base*altura;
    }
    double calcularPerimetro(){
        return (2*base) + (2*altura);
    }
}
class Cuadrado{
    int lado;
    public Cuadrado(int lado){
        this.lado = lado;
    }
    double calcularArea() {
        return lado*lado;
    }
    double calcularPerimetro() {
        return (4*lado);
    }
}
class TrianguloRectangulo{
    int base;
    int altura;
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularArea() {
        return (base * altura / 2);
    }
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
                == calcularHipotenusa()))
            System.out.println("Es un triangulo equilatero"); /* Todos sus
lados son iguales */
        else if ((base != altura) && (base != calcularHipotenusa()) &&
                (altura != calcularHipotenusa()))
            System.out.println("Es un triangulo escaleno"); /* Todos sus
lados son diferentes */
        else
            System.out.println("Es un triangulo isosceles"); /* De otra
manera, es isósceles */
    }
}
public class PruebaFiguras {
    public static void main(String args[]) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        System.out.println("El área del círculo es = " + figura1.
                calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.
                calcularPerimetro());
        System.out.println();
        System.out.println("área del rectángulo es = " + figura2.
                calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.
                calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.
                calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.
                calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.
                calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.
                calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
}