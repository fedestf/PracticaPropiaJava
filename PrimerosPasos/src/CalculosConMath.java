
public class CalculosConMath {

	public static void main(String[] args) {
			int g=144;
			double raiz=Math.sqrt(g); //sqrt para raiz
			System.out.println(raiz);
			// redondeo de un numero
			
			double a= 8.66;
			int resultado=(int)Math.round(a);// conversion de un dato obligadamente a un int 
			System.out.println(resultado);
			
			// potencia
			
			double base=5;
			double exponente=3;
			int resultado2=(int)Math.pow(base, exponente);
			System.out.println("el resultado de "+base+" elevado a la "+exponente+ " es "+resultado2);
	}

}
