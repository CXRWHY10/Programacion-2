
public class Persona {
    String nombre;
    int edad;

    Persona(){
    }
    Persona(String nombre){
        this.nombre = nombre;
    }
    Persona(int edad) {
        this.edad = edad;
    }
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void verificarEdad(){
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        } else if (edad <=17) {
            System.out.println("Es menor de edad");
        }
    }
}
class IPersona {
    public static void main(String[] args) {

        /*Persona persona1 = new Persona();
        persona1.nombre= "juan";
        persona1.edad = 19;

        System.out.println(persona1.nombre);
        System.out.println(persona1.edad);

        persona1.saludar();
        System.out.println(personita.nombre);
        System.out.println(personita.edad);*/


        Persona personita = new Persona("Juan Fernandez",15 );
        System.out.println("nombre: "+personita.nombre+"\n"+"edad: "+personita.edad+" años");
        personita.verificarEdad();
    }
}
