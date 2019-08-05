import javax.swing.*;
public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "Federico";
		String pass="";
		
		while(clave.equals(pass)==false) 
		{
			pass=JOptionPane.showInputDialog("Ingrese Contraseña :");
			
			if (clave.equals(pass)==false)
				{
				System.out.println("la clave es incorrecta");
				}
		}
		if(clave.equals(pass)==true) 
		{
			System.out.println("Clave correcta");
		}
	}

}
