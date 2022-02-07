package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarElNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int adivinarnumRandom = (int) (Math.random() * 500);
        
        int num = 0;
        int intentos = 0;
        do {
            boolean leido;
            do {
                System.out.println("Introduzca un numero (del 1 al 500)");
                try {
                    intentos++;
                    num = sc.nextInt();
                    System.out.println("El numero introducido es: " + num);
                    leido = true;
                } catch (InputMismatchException ex) {
                    System.out.println("No has introducido un numero entero");
                    sc.next(); 
                    leido = false;
                }
            } while (leido == false);

            if (num > adivinarnumRandom) {
                System.out.println("El numero es menor. Introduce de nuevo un número");

            }
            if (num < adivinarnumRandom) {
                System.out.println("El numero es mayor. Introduce de nuevo un número");
            }

        } while (num != adivinarnumRandom);

        System.out.println("Has acertado, el numero es: " + adivinarnumRandom);
        System.out.println("Número de intentos: " + intentos);

    }

}