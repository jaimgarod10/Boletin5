
package boletin6_7;

import java.util.Scanner;

public class Calcular {
        Scanner teclado = new Scanner(System.in);

    public void perimetroCuadrado() {
        System.out.println("Tamaño del lado? ");
        float lado = teclado.nextFloat();
        float perimetro = lado * lado;
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

    public void perimetroTriangulo() {
        System.out.println("Tamaño de la base? ");
        float base = teclado.nextFloat();
        System.out.println("La altura?");
        float altura = teclado.nextFloat();
        float perimetro = base * altura / 2;
        System.out.println("El perímetro del triángulo: " + perimetro);
    }

    public void perimetroCirculo() {
        System.out.println("Tamaño del radio? ");
        float radio = teclado.nextFloat();
        float perimetro = (float) Math.PI * ((float) Math.pow(radio, 2));
        System.out.println("El perímetro del cículo: " + perimetro);
    }

    public void calcular() {
        System.out.println("Que perímetro desea calcular? \n1.-Cuadrado." + "\n2.-Triángulo.\n3.-Círculo.");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                if (opcion == 1) {
                    perimetroCuadrado();
                    break;
                }
            case 2:
                if (opcion == 2) {
                    perimetroTriangulo();
                    break;
                }
            case 3:
                if (opcion == 3) {
                    perimetroCirculo();
                    break;
                }
            default:
                System.out.println("Opción incorrecta");
        }

    }
}
