public class Avion {
    private String fabricante;
    private int numeroMotores;
    Avion (String fabricante, int numeroMotores){
        this.fabricante = fabricante;
        this.numeroMotores = numeroMotores;
    }
    public String getFabricante(){
        return fabricante;
    }
    void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    void cambiarFabricante(Avion a){
        a.setFabricante("Lockheed");
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }
    private void setNumeroMotores(int numeroMotores){
        this.numeroMotores = numeroMotores;
    }
    public void imprimirFabricante(){
        System.out.println("El fabricante del avion es: "+ fabricante);
    }
}
class Avions{
    public static void main(String[]args) {
        Avion a1 = new Avion("Airbus", 4);
        Avion a2;
        Avion a3 = new Avion("Boeing", 4);
        a2 = a1;
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.setFabricante("Douglas");
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.cambiarFabricante(a2);
        a2.imprimirFabricante();
    }
}
