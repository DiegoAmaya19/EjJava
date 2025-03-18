package mundo;

import java.util.Scanner;

public class HolaMundoPersonalizado 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor ingrese su nombre");
		
		String nombre = sc.nextLine();
		
		System.out.println("Hola "+nombre+", Bienvenido al curso de Java.");
		
		sc.close();
	}

}
