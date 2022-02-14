package Ejercicio5;

import javax.swing.JOptionPane;


public class MainApp {
	
	 public static void main(String[] args) throws Exception {
		 try {
			 String txt = JOptionPane.showInputDialog("Introduce un tamaño para el array");
		     int tamany = Integer.parseInt(txt);
		  
		     txt=JOptionPane.showInputDialog("Introduce la longitud del password");
		     int longitud = Integer.parseInt(txt);
		     
		     if (longitud < 0 || tamany < 0) {
		    	 Exception e = new Exception("Tienes que introducir un número entero");
		    	 throw e;
		     }
		  
		     Password array1[] = new Password[tamany];
		     boolean array2[] = new boolean[tamany];
		  
		     for(int i = 0; i < array1.length; i++) {
		     	array1[i] = new Password(longitud);
		     	array2[i] = array1[i].esFuerte();
		        System.out.println(array1[i].getPasswd() + " " + array2[i]);
		     }
		     
		 } catch(NumberFormatException ex) {
	    	 System.out.println("Tienes que introducir un número");
		 } catch(Exception ex) {
		    	 System.out.println(ex.getMessage());
		 }
	}
}