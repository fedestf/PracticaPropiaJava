import java.util.*;
import javax.swing.*;
public class CalcularAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner (System.in);
		System.out.println("Ingrese opcion : \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		int figura=entrada.nextInt();
		
		switch (figura) {
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Lado: "));
			System.out.println("el area es :"+ Math.pow(lado, 2));
			break;
		case 2 :
			int base=Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es "+ base*altura);
			break;
		case 3:
			base=Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("el area del trianguno es"+(base*altura)/2);
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("ingrese radio :"));
			System.out.print("el area es: ");
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
			break;
		default:
			System.out.println("la opcion no es correcta");
		}
	}

}
