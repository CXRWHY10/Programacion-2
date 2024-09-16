public class Pelicula {
    private String nombre;
    private String director;
   enum tipo {ACCION,COMEDIA,DRAMA, SUSPENSO};
    static tipo tipogenero;
    private int duracion;
    private int año;
    private double calificacion;

    public Pelicula(String nombre,String director, tipo genero, int duracion, int año, double calificacion){
        this.nombre=nombre;
        this.director=director;
        this.tipogenero=genero;
        this.duracion=duracion;
        this.año=año;
        this.calificacion=calificacion;
    }
    public String getNombre(){
        return nombre;
    }
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDirector(){
        return director;
    }
    private void setDirector(String director){
        this.director = director;
    }
    tipo getGenero(){
        return tipogenero;
    }
    private void setGenero(tipo genero){
        this.tipogenero = genero;
    }
    public int getDuracion(){
        return duracion;
    }
    private void setDuracion(int duracion){
        this.duracion = duracion;
    }
    public int getAño(){
        return año;
    }
    private void setAño(int año){
        this.año = año;
    }

    public double getCalificacion() {
        return calificacion;
    }
    private void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
    public void Imprimir(){
        System.out.println("NOMBRE : "+nombre);
        System.out.println("DIRECTOR : "+director);
        System.out.println("GENERO : "+ tipogenero);
        System.out.println("DURACION : "+duracion);
        System.out.println("AÑO : "+año);
        System.out.println("CALIFICAION : "+calificacion);
    }
    boolean esPeliculaEpica(){
        if(duracion >= 180){
            return true;
        }else{
            return false;
        }
    }
    private String calcularValoracion(){
        if (calificacion >= 0 && calificacion <= 2) {
            return "Muy mala";
        } else if (calificacion > 2 && calificacion <= 5) {
            return "Mala";
        } else if (calificacion > 5 && calificacion <= 7) {
            return "Regular";
        } else if (calificacion > 7 && calificacion <= 8) {
            return "Buena";
        } else if (calificacion > 8 && calificacion <= 10){
            return "Excelente";
        } else {
            return "No tiene asignada una valoracion válida";
        }
    }
    boolean esSimilar(Pelicula pelicula){
        if(pelicula.tipogenero == tipogenero && pelicula.calcularValoracion() == calcularValoracion()){
            return true;
        }else{
            return false;
        }
    }
}
class Peliculas {
    public static void main(String ags[]) {
        Pelicula pelicula1 = new Pelicula("Gandhi", "Richard Attenborough", Pelicula.tipogenero.DRAMA,191,1982,8.3);
        Pelicula pelicula2 = new Pelicula("Thor", "kenneth Branagh", Pelicula.tipogenero.ACCION, 115,2011,7.0);
        pelicula1.Imprimir();
        System.out.println();
        pelicula2.Imprimir();
        System.out.println();
        System.out.println("La pelicula " + pelicula1.getNombre() + " es epica: " + pelicula1.esPeliculaEpica());
        System.out.println("La pelicula " + pelicula2.getNombre() + " es epica: " + pelicula2.esPeliculaEpica());
        System.out.println("La pelicula " + pelicula1.getNombre() + "  y la pelicula " + pelicula2.getNombre() + " son similares = " + pelicula1.esSimilar(pelicula2));
    }
}
