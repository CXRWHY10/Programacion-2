public class Persona2 {
    String PaisDeNacimiento;
    String nombre, apellido;
    int FechaDeNacimiento, CI;
    char genero;
    Persona2(){
     }
    Persona2(String nombre, String apellido, String PaisDeNacimiento, int FechaDeNacimiento, int CI, char genero){
         this.nombre = nombre;
         this.FechaDeNacimiento = FechaDeNacimiento;
         this.CI = CI;
         this.apellido = apellido;
         this.PaisDeNacimiento = PaisDeNacimiento;
         this.genero = genero;
     }
    Persona2(String nombre){
         this.nombre = nombre;
     }
    Persona2(int FechaDeNacimiento){
         this.FechaDeNacimiento = FechaDeNacimiento;
     }
    public void ImprimirDatos(){
         System.out.println("Nombre: "+ nombre);
         System.out.println("Apellido: "+ apellido);
         System.out.println("C1: "+ CI);
         System.out.println("Fecha De Nacimiento: "+ FechaDeNacimiento);
         System.out.println("PaisDeNacimiento: "+ PaisDeNacimiento);
         System.out.println("Genero: "+ genero);
     }
    Persona2(char genero){
        this.genero = genero;
    }
}
class prueba2 {
    public static void main (String[]args){
        Persona2 persona = new Persona2();
        persona.nombre= "Charly";
        persona.apellido = "Montaño";
        persona.CI = 10111011;
        persona.FechaDeNacimiento = 2005;
        persona.PaisDeNacimiento = "Argentina";
        persona.genero = 'M';

        persona.ImprimirDatos();
    }
}