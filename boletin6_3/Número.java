
package boletin6_3;

import java.util.Scanner;

public class Número {
    
private float Número;

public Número(float num){
        this.Número=num;
    }
    
    public Número(){
   
    }
       
    public float getnum(float Número, float numero) {
        return Número;
    }

    public void setnum(float Número, float numero) {
       this.Número= numero;
       
    }
        public void Número(float num){
        if(num>0)
            System.out.println(" + ");
        else if(num == 0) 
            System.out.println(" 0 ");
        else if (num<0)
            System.out.println("-");
    }


    public void pedirSigno(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce nº: ");
        
    }

}
