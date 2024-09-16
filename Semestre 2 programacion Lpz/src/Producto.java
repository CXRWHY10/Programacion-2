import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Producto {
    private String nombre;
    private String tipo;
    private float precio;
    public Producto (String nombre, String tipo, float precio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    public String toString(){
        return "producto "+nombre+" tipo: "+tipo+" precio: "+precio;
    }
}
class prueba{
    public static void main (String[]args){
        Scanner leer = new Scanner(System.in);
        List<Producto> productos = new ArrayList<>();
        System.out.println("Ingrese la cantidad de productos a registrar");
        int numeroProductos = leer.nextInt();
        for (int i = 0; i<numeroProductos; i++){
            System.out.println("Producto:" +(i + 1)+ ": ");
            System.out.println("ingrese el nombre");
            String nombre = leer.next();
            System.out.println("ingrese el tipo");
            String tipo = leer.next();
            System.out.println("ingrese el precio");
            float precio = leer.nextFloat();
            productos.add(new Producto(tipo, nombre, precio));
            Producto productoMasCaro = buscarProductoMasCaro(productos);
            System.out.println("El producto mas caro es: "+productoMasCaro);
        }
    }
    public static Producto buscarProductoMasCaro(List<Producto> productos) {
        if (productos.isEmpty()) {
        }
        Producto masCaro = productos.get(0);
        for (Producto p : productos) {
            if (p.getPrecio() > masCaro.getPrecio()) {
                masCaro = p;
            }
        }
        return masCaro;
    }
}