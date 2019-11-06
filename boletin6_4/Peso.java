
package boletin6_4;

public class Peso {
 
      private String nombre;
    private float peso;
    
    public Peso(){
    }
    
    public Peso(String nombre, float peso){
        this.nombre=nombre;
        this.peso=peso;
    }
    public void setnome(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public void setpeso(float peso){
        this.peso=peso;
    }
    public float getpeso(){
        return peso;
    }
    
    
    
}
