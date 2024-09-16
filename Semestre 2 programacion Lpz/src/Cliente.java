public class Cliente {
    String nombre;
    int codigo;
    int Telefono;
    Cliente(){
    }
    Cliente(String nombre){
        this.nombre= nombre;
    }
    Cliente(int Telefono){
        this.Telefono = Telefono;
    }
    Cliente (String nombre, int Telefono, int codigo){
        this.nombre = nombre;
        this.Telefono = Telefono;
        this.codigo = codigo;
    }
    public void ImprimirDatos(){
        System.out.println("codigo: "+ codigo);
        System.out.println("nombre: "+ nombre);
        System.out.println("Telefono: "+ Telefono);
    }
}
class clientePrueba {
    public static void main (String[]args){

        Cliente cliente = new Cliente();
        cliente.nombre = " Jaime ";
        cliente.Telefono = 12345678;
        cliente.codigo = 123;
        //System.out.println(cliente.nombre);

        cliente.ImprimirDatos();
    }
}
