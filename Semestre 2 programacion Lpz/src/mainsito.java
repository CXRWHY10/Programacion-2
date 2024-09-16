import java.util.Scanner;

public class mainsito {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numVehiculo, indiceCocheBarato;
        System.out.println("ingrese la cantidad de vehiculos a recoger");
        numVehiculo = sc.nextInt();
        Vehiculo autos[] = new Vehiculo[numVehiculo];
        for (int i = 0; i < autos.length; i++) {
            System.out.println("Ingrese la marca");
            marca = sc.next();
            System.out.println("Ingrese el modelo");
            modelo = sc.next();
            System.out.println("Ingrese el precio");
            precio = sc.nextFloat();
            autos[i] = new Vehiculo(marca, modelo, precio);
        }
        /*int indiceBarato = indiceCocheBarato(autos);
        System.out.println("El auto mas barato");
        System.out.println(autos[indiceBarato].mostrarDatos());
    }
    public static int IndiceCocheBarato(Vehiculo autos[]) {
        float precio;
        int indice = 0;
        precio = autos[0].getPrecio();
        int i;
        for (i = 0; i < autos.length; i++) {
            if (autos[i].getPrecio() < precio) {
                precio = autos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
        autos[i] = new Vehiculo(marca, modelo, precio);
    }*/
    }
}

