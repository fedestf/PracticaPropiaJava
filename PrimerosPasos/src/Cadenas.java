
public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Federico lopez"; //char va en comilla simple ''
		
		System.out.println(nombre);
		//cantidad letras
		System.out.println("El nombre tiene "+nombre.length()+" letras");
		//letra en posicion X
		System.out.println("la primer letra es "+nombre.charAt(0));
		//ultima letra con cadena de x cantidad
		int ultima_letra;
		ultima_letra=nombre.length();
		
		System.out.println("la ultima letra es la "+ nombre.charAt(ultima_letra-1));
	}

}
