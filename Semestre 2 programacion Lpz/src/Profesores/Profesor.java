package Profesores;
public class Profesor {
    protected void imprimir (){
        System.out.println("Es un profesor");
    }
}
class profesorTitular extends Profesor {
    protected void imprimir() {
        System.out.println("Es un porfesor titular");
    }
}
class Prueba {
    public static void main(String[] args) {
        Profesor profesor1 = new profesorTitular();
        Profesor profesor2 = (Profesor) profesor1;
        profesor2.imprimir();
    }
}


