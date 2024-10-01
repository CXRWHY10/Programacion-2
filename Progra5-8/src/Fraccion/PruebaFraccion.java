package Fraccion;

public class PruebaFraccion {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(1, 2); // 1/2
        Fraccion f2 = new Fraccion(1, 3); // 1/3
        System.out.println("Fracción 1: " + f1);
        System.out.println("Fracción 2: " + f2);

        Numerica suma = f1.sumar(f2);
        System.out.println("Suma: " + suma);

        Numerica resta = f1.restar(f2);
        System.out.println("Resta: " + resta);

        Numerica multiplicacion = f1.multiplicar(f2);
        System.out.println("Multiplicación: " + multiplicacion);

        Numerica division = f1.dividir(f2);
        System.out.println("División: " + division);
    }
}
