
package boletin6_2;

import java.util.Scanner;

public class Número {

    short num1;
    short num2;
     
    
    Scanner sc = new Scanner(System.in);
    public void comparar(){
        System.out.println("Escriba un numero");
        short numero1 = sc.nextShort();
        System.out.println("Escriba otro numero");
        short numero2 = sc.nextShort();
        if (numero1 >= numero2) {
            System.out.println("La resta es " + (numero1 - numero2));
        } else {
            System.out.println("La suma es " + (numero1 + numero2));
        }
    }
     
 }
