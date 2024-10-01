package profesores1;

public class ProfesorTitular2 extends Profesor {
    int años = 0;
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
    protected void imprimirAños() {
        System.out.println("Años = " + años);
    }
}
