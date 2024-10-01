package Fraccion;

public class Fraccion extends Numerica {
    private int numerador;
    private int denominador;
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }
    private void simplificar() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }
    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Fraccion fraccion = (Fraccion) ob;
        return numerador == fraccion.numerador && denominador == fraccion.denominador;
    }

    @Override
    public Numerica sumar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otra.denominador + otra.numerador * this.denominador;
            int nuevoDenominador = this.denominador * otra.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El objeto no es una fracción");
    }

    @Override
    public Numerica restar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otra.denominador - otra.numerador * this.denominador;
            int nuevoDenominador = this.denominador * otra.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El objeto no es una fracción");
    }

    @Override
    public Numerica multiplicar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otra.numerador;
            int nuevoDenominador = this.denominador * otra.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El objeto no es una fracción");
    }

    @Override
    public Numerica dividir(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            if (otra.numerador == 0) {
                throw new IllegalArgumentException("División por cero.");
            }
            int nuevoNumerador = this.numerador * otra.denominador;
            int nuevoDenominador = this.denominador * otra.numerador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El objeto no es una fracción");
    }
}

