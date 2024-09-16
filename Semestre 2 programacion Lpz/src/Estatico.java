public class Estatico {
    private static String frase = "Primera frase";
    public static int suma(int a, int b){
        int resultado =a + b;
        return resultado;
    }
    public static void main( String[] args){
        System.out.println(Estatico.frase);
        System.out.println(suma(4,5));
    }
}
