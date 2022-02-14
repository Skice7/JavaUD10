package Ejercicio5;

public class Password {

	final static int LONGITUD = 8;

	private int longitud;
	private String passwd;
	
	public Password (){
		this.longitud = LONGITUD;
	}

	public Password (int longitud){
		this.longitud = longitud;
		passwd = generarPassword();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPasswd() {
		return passwd;
	}

	public String generarPassword() {
		String password = "";
		for (int i = 0; i < longitud; i++) {
			int eleccion = ((int)Math.floor(Math.random()*3+1));
			if (eleccion == 1) {
				char minus = (char)((int)Math.floor(Math.random()*(123-97)+97));
				password+=minus;
			} else {
				if(eleccion == 2){
					char mayus = (char)((int)Math.floor(Math.random()*(91-65)+65));
					password+=mayus;
				} else {
					char nums = (char)((int)Math.floor(Math.random()*(58-48)+48));
					password+=nums;
				}
			}
		}
		return password;
	}

	public boolean esFuerte(){
		int numeros = 0;
		int minusculas=0;
		int mayusculas=0;
		
		for (int i = 0; i < passwd.length(); i++){
			if (passwd.charAt(i) >= 97 && passwd.charAt(i) <= 122){
				minusculas+=1;
			}else{
				if (passwd.charAt(i) >= 65 && passwd.charAt(i) <= 90){
					mayusculas+=1;
				} else {
					numeros+=1;
				}
			}
		}
		if (numeros >= 5 && minusculas >= 1 && mayusculas >= 2){
			return true;
		}else{
			return false;
		}
	}
}