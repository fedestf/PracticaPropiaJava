import java.util.*;
public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);//lector
		System.out.println("Introduce tu edad: ");
		int edad=entrada.nextInt();//recibe el proximo valor
		
		
		if (edad>=18) {
			System.out.println("es mayor");
		}
		
		else {
			System.out.println("es menor");
		}
	
	}

}
