import java.util.Scanner;
public class Cuenta {
    protected float saldo;
    protected int numeroC = 0;
    protected int numeroRetiro = 0;
    protected float tasaAnual;
    protected float ComisionMensual = 0;
    public Cuenta(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    public void Consignar(float cantidad){
        saldo = saldo+cantidad;
        numeroC = numeroC + 1;
    }
    public void retirar(float cantidad){
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0){
            saldo-= cantidad;
            numeroRetiro = numeroRetiro + 1;
        }else {
            System.out.println("La cantidad a retirar excede el saldo actual");
        }
    }
    public void calcularInteres(){
        float tasaMensual = tasaAnual/12;
        float interesMensual = saldo*tasaMensual;
        saldo+= interesMensual;
    }
    public void estractoMensual(){
        saldo-= ComisionMensual;
        calcularInteres();
    }
}

class CuentaAhorros extends Cuenta {
    private boolean activa;
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 10000) {
            activa = false;
        } else {
            activa = true;
        }
    }
    public void retirar(float cantidad){
        if (activa){
            super.retirar(cantidad);
        }
    }
    public void consignar(float cantidad){
        if (activa){
            super.Consignar(cantidad);
        }
    }
    public void estractoMensual() {
        if (numeroRetiro > 4){
            ComisionMensual += (numeroRetiro - 4) * 1000;
        }
        super.estractoMensual();
        if (saldo < 10000){
            activa = false;
        }
    }
    public void imprimir(){
        System.out.println("Saldo = "+saldo);
        System.out.println("Comision Mensual = "+ComisionMensual);
        System.out.println("Numero de transacciones = "+numeroC + numeroRetiro);
        System.out.println();
    }
}
class CuentaCorriente extends Cuenta {
    float sobregido;
    public CuentaCorriente (float saldo, float tasa){
        super(saldo,tasa);
        sobregido = 0;
    }
    public void retirar(float cantidad) {
        float resultado = saldo - cantidad;
        if (resultado < 0){
            sobregido = sobregido - resultado;
            saldo = 0;
        }else {
            super.retirar(cantidad);
        }
    }
    public void consignar (float cantidad){
        float residuo = sobregido - cantidad;
        if (sobregido > 0){
            if (residuo > 0){
                sobregido = 0;
                saldo = residuo;
            }else {
                sobregido =- residuo;
                saldo = 0;
            }
        }else {
            super.Consignar(cantidad);
        }
    }
    public void estractoMensual (){
        super.estractoMensual();
    }
    public void imprimir (){
        System.out.println("Saldo = "+ saldo);
        System.out.println("Cargo mesual = "+ ComisionMensual);
        System.out.println("Numero de transacciones = "+ numeroC + numeroRetiro);
        System.out.println("Valor de ingresos = "+numeroC + numeroRetiro);
        System.out.println("");
    }
}
class pruebaCuenta {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese el saldo inicial = ");
        float saldoinicialAhorros = input.nextFloat();
        System.out.println("Ingrese la tasa de interes = ");
        float tasaAhorros = input.nextFloat();
        CuentaAhorros cuenta1 = new CuentaAhorros(saldoinicialAhorros, tasaAhorros);
         System.out.println("Ingrese la cantidad a consignar: ");
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.println("Ingrese cantidad a retirar: ");
        float cantidadRetirar = input.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.estractoMensual();
        cuenta1.imprimir();
    }
}