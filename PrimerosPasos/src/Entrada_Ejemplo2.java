import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre: ");
		String edad=JOptionPane.showInputDialog("Introduce edad: ");
		int edad_usuario=Integer.parseInt(edad);
		System.out.println("nombre " +nombre_usuario+ " edad " +edad_usuario);
	}

}
