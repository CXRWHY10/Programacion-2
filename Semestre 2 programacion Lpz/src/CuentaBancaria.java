public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;

    enum tipo {AHORROS, CORRIENTE}

    static tipo tipoCuenta;
    float saldo = 0;
    int interesMensual = 10;
    int Saldo;

    CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, int Saldo, tipo tipoCuenta) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.Saldo = Saldo;
    }

    tipo getTipoCuenta() {
        return tipoCuenta;
    }

    void setTipoCuenta(tipo tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + numeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
        System.out.println("Interes Mensual = "+ interesMensual);
        System.out.println("Interes Aplicado a la cuenta : "+ Saldo);
    }

    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
    }
    public void AplicarInteres(double TasaInteres){
        Saldo += Saldo * (TasaInteres / 100);
    }
    void ObtenerSaldo(){
    }
    boolean consignar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }

    boolean retirar(int valor) {
        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
        }
    }
}
class Banco{
    public static void main(String[]args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro","Perez", 123456789, 1000,CuentaBancaria.tipoCuenta.AHORROS);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
    }
}
