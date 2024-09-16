public class Personas {
    private final String nombre;
    private int edad;
    public Personas (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
}
class P {
    public static void main (String[]args){
        Personas persona = new Personas("Alex", 20);
        persona.mostrarDatos();

        persona.setEdad(21);
        persona.mostrarDatos();
    }
}

