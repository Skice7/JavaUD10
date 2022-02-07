package Ejercicio3;

public class NumRandomParImpar {
	public static void main(String[] args) {
        try {
            System.out.println("Generando número aleatorio...");
            int entero = (int) (Math.random() * 1000);
            System.out.println("El número aleatorio generado es : "+entero);
            if (entero % 2 == 0) {
                throw new Exception("Es par");
            } else {
                throw new Exception("Es impar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
