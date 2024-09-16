public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public float getPrecio(){
        return precio;
    }
    public String mostrarDatos(){
        return "MARCA: "+marca+"ln MODELO: "+modelo+"lm PRECIO: "+precio+"...";
    }
}
