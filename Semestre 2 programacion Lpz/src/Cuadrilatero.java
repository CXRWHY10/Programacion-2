import javax.swing.*;

public class Cuadrilatero {
    private float lado1,lado2;

    public Cuadrilatero(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Cuadrilatero(float lado1){
        this.lado1 = this.lado2 = lado1;
    }
    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    public float getPerimetro(){
        float perimetro = 2*(lado1 + lado2);
        return perimetro;
    }
    public float getArea (){
        float area = lado1*lado2;
        return area;
    }

}
class Calcular {
    public static void main (String[]args){
        Cuadrilatero cu;
        float lado1, lado2;
      lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
      lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));

      if (lado1 == lado2){
          cu = new Cuadrilatero(lado1);
      }else {
          cu = new Cuadrilatero(lado1,lado2);
      }
        System.out.println("El perimetro es: "+cu.getPerimetro());
        System.out.println("El Area es: "+cu.getArea());
    }
}
