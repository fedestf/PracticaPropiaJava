import java.util.Scanner;
public class Entrada_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner (System.in);
		
		System.out.println ("Introduce tu nombre :");
		String nombre_usuario= entrada.nextLine();
		System.out.println("Introduce edad :");
		int edad=entrada.nextInt();
		System.out.println("Hola "+nombre_usuario+". el a�o que viene tendras "+(edad+1));
		
	}

}
