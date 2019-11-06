
package boletin6_5;

public class Boletin6_5 {

    public static void main(String[] args) {
       
        Numeros num = new Numeros();
        Numeros num1 = new Numeros();
        Numeros num2 = new Numeros();
        Numeros num3 = new Numeros();
        
        int n1 = num1.pedirNum();
        int n2 = num2.pedirNum();
        int n3 = num3.pedirNum();
        
        System.out.println(num.ordenMaior(n1, n2, n3));
    }
}
