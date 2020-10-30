 

public class Practica1 

{
	public static void main (String args[]) 
	{	char dato2=0, dato3=' ';
		String Apellidos="Esqueda Garcia";
		String consonantes="bcdfghjklmnpqrstvxyzñ";
		int x=0, y=0;
		
		for (int i =0; i<Apellidos.length(); i++) 
		{ 	
		System.out.println(Apellidos.charAt(i));
		if (Apellidos.charAt(i)==' ' || y==1) 
		{	y=1;
			System.out.println(" * ");
			for (int j =0; j<consonantes.length(); j++) 
			{
				if (Apellidos.charAt(i)==consonantes.charAt(j)) 
				{
					System.out.println("Listo");
				}
			}
		}
		
		
		
		}
		
		System.out.println(dato2);	
		System.out.println(Apellidos.charAt(10));	
	}
	
	


}