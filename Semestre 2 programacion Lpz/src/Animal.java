public class Animal {
    String nombre;
    String raza;
    String color;
    int tamaño;

    public void correr_y_ladrar(){
        System.out.println("corre y ladra");
    }
}
class animalPrueba {
    public static void main (String[]args){
        Animal animal1 = new Animal();
        animal1.nombre = "Jack";
        animal1.raza = "pug";
        animal1.color = "beige";
        animal1.tamaño = 40;
        /////////////////////////////////////////
        System.out.println(animal1.nombre);
        System.out.println(animal1.raza);
        System.out.println(animal1.color);
        System.out.println(animal1.tamaño);
        animal1.correr_y_ladrar();

    }
}
