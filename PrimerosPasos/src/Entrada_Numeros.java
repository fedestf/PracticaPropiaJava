import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=10000.0;
		System.out.printf("%1.2f",x/3);// dar formato de 2 decimales
		
		String num1=JOptionPane.showInputDialog("Ingrese un numero");
		double num2=Double.parseDouble(num1);//parse para convertir a otros formatos
		System.out.print("la raiz de "+num2+" es ");
		System.out.printf("%1.2f",Math.sqrt(num2));//raiz
	}

}
