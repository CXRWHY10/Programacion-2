public class Planeta {
    String nombre;
    int cantidadSatélites, diámetro, distanciaSol;
    double masa, volumen;
    enum tipoPlaneta {Gaseoso, Terrestre, Enano}
    tipoPlaneta tipo;
    boolean esObservable = false;

    Planeta(String nombre, int cantidadSatélites, double masa, double volumen, int diámetro,
            int distanciaSol, tipoPlaneta tipo, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }
    public void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatélites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diámetro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
    }
    double calcularDensidad() {
        return masa/volumen;
    }
    boolean esPlanetaExterior(){
        float límite = (float) (149597870 * 3.4);
        if (distanciaSol > límite) {
            return true;
        } else {
            return false;
        }
    }
}
class pruebaPlantea {
    public static void main (String[]args){
        Planeta planeta1 = new Planeta(
                "tierra",1,5.9736E24,1.08321E12,12742,
                150000000, Planeta.tipoPlaneta.Terrestre,true);
        planeta1.imprimir();
        System.out.println("Densidad del planeta = " + planeta1.calcularDensidad());
        System.out.println("Es planeta exterior = " + planeta1.esPlanetaExterior());
        System.out.println();
        Planeta planeta2 = new Planeta("Jupiter",79,1.899E27,1.4313E15,
                139820,750000000, Planeta.tipoPlaneta.Gaseoso,true);
        planeta2.imprimir();
        System.out.println("Densidad del planeta = " + planeta2.calcularDensidad());
        System.out.println("Es planeta exterior = " + planeta2.esPlanetaExterior());
    }
}

