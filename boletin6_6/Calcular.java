
package boletin6_6;

public class Calcular {
    
    private String nombre_articulo;
    private int num_ventas;

    public Calcular() {

    }

    public Calcular(String nombre_articulo, int num_ventas) {
        this.nombre_articulo = nombre_articulo;
        this.num_ventas = num_ventas;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public int getNum_ventas() {
        return num_ventas;
    }

    public void setNum_vendas(int num_ventas) {
        this.num_ventas = num_ventas;
    }

    public void calcular_tipo() {
        
        if (num_ventas <= 100) {
            System.out.println("baixo");

        }
        if (num_ventas > 100 && num_ventas <= 500) {
            System.out.println("medio");
        }
        if (num_ventas > 500 && num_ventas <= 1000) {
            System.out.println("alto");

        }
        if (num_ventas > 1000) {
            System.out.println(" primera necesidad ");
        }

    }
    
}
