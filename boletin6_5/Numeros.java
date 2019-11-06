
package boletin6_5;

import java.util.Scanner;

public class Numeros {
    
    private int numero1;
    private int numero2;
    private int numero3;
    
    public Numeros(){
    
    }
    
    public Numeros(int num1, int num2, int num3){
        this.numero1 = num1;
        this.numero2 = num2;
        this.numero3 = num3;
    }
    
    Scanner sc = new Scanner (System.in);
    public int pedirNum(){
    System.out.println("Dime un número:");
    int num = sc.nextInt();
    return num;
    }
   
    public String ordenMaior(int num1, int num2, int num3){
        int maior=0;
    if (num1 > num2 && num2>num3)
        maior = num1;
        else if (num1>num3 && num3>num2)
        maior = num1;
        else if (num2>num1 && num1>num3)
        maior = num2;
        else if (num2>num3 && num3>num1)
        maior = num2;
        else if (num3>num2 && num2>num1)
        maior = num3;
        else if (num3>num1 && num1>num2)
        maior = num3;
        return ("O maior é: "+maior);
    }

}