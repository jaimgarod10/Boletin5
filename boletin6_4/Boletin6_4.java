
package boletin6_4;

import java.util.Scanner;

public class Boletin6_4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclea nombre1: ");
        String nombre1 = sc.next();
        System.out.print("Teclea peso1: ");
        float peso1 = sc.nextFloat();
        Peso obxPeso1 = new Peso(nombre1, peso1);
        System.out.print("Teclea nombre2: ");
        String nombre2 = sc.next();
        System.out.print("Teclea peso2: ");
        float peso2 = sc.nextFloat();
        Peso obxPeso2 = new Peso(nombre2, peso2);
   
        if (obxPeso1.getpeso()> obxPeso2.getpeso()) {
        System.out.println(obxPeso1.getnombre()+" ten maior peso");
        System.out.println("Diferencia de peso: "+(obxPeso1.getpeso() - obxPeso2.getpeso()+" kg"));
        } else {
        System.out.println(obxPeso2.getnombre()+" ten maior peso");
        System.out.println("Diferencia de peso: "+(obxPeso2.getpeso() - obxPeso1.getpeso()+" kg"));
        }
    }
        
}
