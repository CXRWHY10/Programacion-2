public class Automovil {
    String marca;
    int modelo;
    int motor;
    int multaActual = 0;
    int multa = 100;
    enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODISESEL,
        GAS_NATURAL}
    tipoCom tipoCombustible;
    enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    tipoA tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    tipoColor color;
    enum tipoCaja {AUTOMATICO,MECANICO}
    tipoCaja caja;
       int velocidadActual = 0;
    Automovil(String marca, int modelo, int motor, tipoCom
            tipoCombustible, tipoA tipoAutomovil, int numeroPuertas,
              int cantidadAsientos, int velocidadMaxima, tipoColor color, tipoCaja caja) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.caja = caja;
    }
    String getMarca() {
        return marca;
    }
    int getModelo() {
        return modelo;
    }int getMotor() {
        return motor;
    }
    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }
    tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }
    int getNumeroPuertas() {
        return numeroPuertas;
    }
    int getCantidadAsientos() {
        return cantidadAsientos;
    }
    int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    tipoColor getColor() {
        return color;
    }
    tipoCaja getCaja(){return caja;}
    int getVelocidadActual() {
        return velocidadActual;
    }
    void setMarca(String marca) {
        this.marca = marca;
    }
    void setModelo(int modelo) {
        this.modelo = modelo;
    }
    void setMotor(int motor) {
        this.motor = motor;
    }
    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    void setColor(tipoColor color) {
        this.color = color;
    }
    void setCaja(tipoCaja caja){this.caja = caja;}
    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else if (velocidadActual + incrementoVelocidad > velocidadMaxima){
            multaActual = multaActual + multa;
            System.out.println("No se puede incrementar a una velocidad superior a la maxima del automovil");
            System.out.println("Recibe una multa de: " + multaActual);
        }
    }
    void desacelerar(int decrementoVelocidad) {
        if ((velocidadActual - decrementoVelocidad) > 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    void frenar() {
        velocidadActual = 0;
    }
    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }
    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automovil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocida maxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("Caja = " + caja);
    }
}
class main {
    public static void main(String args[]) {
        Automovil automovil1 = new
                Automovil("Ford",2018,3, Automovil.tipoCom.DIESEL,Automovil.tipoA.EJECUTIVO,5,6,250,
                Automovil.tipoColor.NEGRO,Automovil.tipoCaja.AUTOMATICO);
        automovil1.imprimir();
        automovil1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + automovil1. velocidadActual);
        automovil1.acelerar(290);
        System.out.println("Velocidad actual = " + automovil1. velocidadActual);
        automovil1.desacelerar(30);
        System.out.println("Velocidad actual = " + automovil1. velocidadActual);
        automovil1.frenar();
        System.out.println("Velocidad actual = " + automovil1. velocidadActual);
        automovil1.desacelerar(20);
        automovil1.acelerar(290);
        System.out.println("Velocidad actual = " + automovil1. velocidadActual);
    }
}
