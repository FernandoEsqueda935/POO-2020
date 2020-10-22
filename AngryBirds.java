


public class AngryBirds {
	public static void main(String[] arg)
	{
		red red = new red("Pepito","Rojo","Circular");
		yellow yellow = new yellow ("Roberto","Amarillo","Triangular");
		blue blue = new blue("Los polinesios","Azul","Circular");
		
		red.lanzamiento();
		red.habilidad();
		System.out.println();
		
		yellow.lanzamiento();
		yellow.habilidad();
		System.out.println();
		
		blue.lanzamiento();
		blue.habilidad();
		
	}

}

class pajaros
{
	String nombre, color, forma;
	
	public pajaros(String nombre, String color, String forma) 
	{
		this.color=color;
		this.forma=forma;
		this.nombre=nombre;
		
	}
	
	public void subiraresortera() 
	{
		System.out.println(nombre +" se esta preparando para lanzarse");
	}
	
	public void lanzamiento() 
	{
		System.out.println(" " +nombre+ " ha sido lanzado");
		
	}
	
	
	

}

class red extends pajaros 
{

	public red(String nombre, String color, String forma) {
		super(nombre, color, forma);

	}
	
	public void habilidad() 
	{
		System.out.println(" Red ha usado su habilidad especial, se ha vuelto más fuerte");
		
	}
}


class yellow extends pajaros 
{

	public yellow(String nombre, String color, String forma) {
		super(nombre, color, forma);

	}
	
	public void habilidad() 
	{
		System.out.println(" Yellow ha usado su habilidad especial, ha aumentado su velocidad");
		
	}
}


class blue extends pajaros 
	{	

		public blue(String nombre, String color, String forma) {
			super(nombre, color, forma);

		}
		
		
		public void habilidad() 
		{
			System.out.println(" Blue ha usado su habilidad especial, se ha dividido");
			
		}
	
	
	
	}
