package Ejercicio4;

import javax.swing.JOptionPane;

public class Calculos {

	public static void suma() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer n�mero"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo n�mero"));
			result = num1 + num2;
			System.out.println("Resultado de la suma: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo n�meros");
		}
	}

	public static void resta() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer n�mero"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo n�mero"));
			result = num1 - num2;
				System.out.println("Resultado de la resta: " + result);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Introduce solo n�meros");
			}
		}

	public static void multiplicar() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer n�mero"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo n�mero"));
			result = num1 * num2;
			System.out.println("Resultado de la multiplicaci�n: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}
		
	public static void potencia() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer n�mero"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero para elevar el primer n�mero"));
			result = (int) Math.pow(num1, num2);
			System.out.println("Resultado de la potencia: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}
		
	public static void raizCuadrada() {
		int num1 = 0;
		int result = 0;
			
		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
			result = (int) Math.sqrt(num1);
			System.out.println("Resultado de la ra�z cuadrada: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}
		
	public static void raizCubica() {
		int num1 = 0;
		int result = 0;
			
		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
			result = (int) Math.cbrt(num1);
			System.out.println("Resultado de la ra�z cubica: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}
		
	public static void dividir() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer n�mero"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo n�mero"));
			result = num1 / num2;
			System.out.println("Resultado de la divisi�n: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}
	
	public static void menu() {
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicaci�n");
		System.out.println("4 - Potencia");
		System.out.println("5 - Ra�z Cuadrada");
		System.out.println("6 - Ra�z Cubica");
		System.out.println("7 - Divisi�n");
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opci�n"));
		switch (opcion) {
		case 1:
			suma();
			break;

		case 2:
			resta();
			break;
		case 3:
			multiplicar();
			break;
		case 4:
			potencia();
			break;
		case 5:
			raizCuadrada();
			break;
		case 6:
			raizCubica();
			break;
		case 7:
			dividir();
			break;
		default:
			System.out.println("Has introducido un n�mero err�neo");
			break;
		}
	}
}
