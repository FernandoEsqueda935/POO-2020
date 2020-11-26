import java.util.Scanner;

public class Practica7 {

	public static void main(String[] args) {
		
		int decision;
		magnusopus chef = new magnusopus("A1");
		cortador cort= new cortador("Juan","B1");
		cocinero coc= new cocinero("Diego","C1");
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Selecciona el platillo que quieres cocinar: ");
		System.out.println("1. Omelette ");
		System.out.println("2. Chilaquiles ");
		
		decision=s1.nextInt();
		switch (decision){
		case 1: omelette p1= new omelette();
		do  {
		System.out.println("Que deseas hacer? 1.Cortar   2. Cocinar   3.Servir" );
		decision=s1.nextInt();
			switch(decision) {
			case 1: 
				System.out.println("Si deseas que lo haga el Magnus Opus con ayuda de "+ cort.nombre + " , introduzca 1, si desea que el Magnus opus lo haga solo, introduzca 2." );
				decision=s1.nextInt();
				if (decision==1) {
				p1.cortar(cort,chef);
				do {
				System.out.println("Que deseas hacer? 1.Cortar   2. Cocinar   3.Servir" );
				decision=s1.nextInt();
					switch(decision) {
					case 1:
						System.out.println("Espera! Estos ingredientes ya estan cortados");
						break;
					case 2: 
						System.out.println("Si deseas que lo haga el Magnus Opus con ayuda de "+ coc.nombre + " , introduzca 1, si desea que el Magnus opus lo haga solo, introduzca 2." );
						decision=s1.nextInt();
						
						if (decision==1) {
						p1.cocinar(coc,chef);
						do {
						System.out.println("Que deseas hacer? 1.Cortar   2. Cocinar   3.Servir" );
						decision=s1.nextInt();
						switch(decision) {
						case 1:
							System.out.println("Espera! los ingredientes ya estan cortados");
							break;
						case 2:
							System.out.println("Espera! los ingredientes ya estan cocinados");
							break;
						case 3:
							p1.servirMO(chef);
							System.out.println("¡Hurra! El plato estaba delicioso");
							break;
						} 
						}while(decision!=3);
						
						}
						
						
						else {
						p1.cocinarMO(chef);
						do {
						System.out.println("Que deseas hacer? 1.Cortar   2. Cocinar   3.Servir" );
						decision=s1.nextInt();
						switch(decision) {
						case 1:
							System.out.println("Espera! los ingredientes ya estan cortados");
							break;
						case 2:
							System.out.println("Espera! los ingredientes ya estan cocinados");
							break;
						case 3:
							p1.servirMO(chef);
							System.out.println("\"¡Hurra! El plato estaba delicioso");
							break;
						}
						}while(decision!=3);
						}
					case 3:
						System.out.println("Espera! los ingredientes aun no estan cocinados");
						break;
						
						}
					} while (decision!=2);
				}
				else {
				p1.cortarMO(chef);	
				
				System.out.println("Que deseas hacer? 1.Cortar   2. Cocinar   3.Servir" );
				decision=s1.nextInt();
					switch(decision) {
					case 2: 
						System.out.println("Si desean que lo haga "+ coc.nombre + " solo, introduzca 1, si desea el que Magnus opus le ayude, introduzca 2." );
						decision=s1.nextInt();
						if (decision==1) {
						p1.cocinar(coc,chef);
						
						}
						else {
						p1.cocinarMO(chef);
						}
					}
				}
			case 2:
				System.out.println("Espera! Aun no haz cortado los ingredientes ");
				break;
			case 3:
				System.out.println("Espera! Aun no haz cortado ni cocinado los ingredientes ");
				break;
			}
		} while(decision!=1 );
		break;
		
		case 2:
			chilaquiles p2= new chilaquiles();
			do  {
			System.out.println("Que deseas hacer? 1.Cortar   2. Cocinar   3.Servir" );
			decision=s1.nextInt();
				switch(decision) {
				case 1: 
					System.out.println("Si deseas que lo haga el Magnus Opus con ayuda de "+ cort.nombre + " , introduzca 1, si desea que el Magnus opus lo haga solo, introduzca 2." );
					decision=s1.nextInt();
					if (decision==1) {
					p2.cortar(cort,chef);
					do {
					System.out.println("Que deseas hacer? 1.Cortar   2. Cocinar   3.Servir" );
					decision=s1.nextInt();
						switch(decision) {
						case 1:
							System.out.println("Espera! Estos ingredientes ya estan cortados");
							break;
						case 2: 
							System.out.println("Si deseas que lo haga el Magnus Opus con ayuda de "+ coc.nombre + " , introduzca 1, si desea que el Magnus opus lo haga solo, introduzca 2." );
							decision=s1.nextInt();
							
							if (decision==1) {
							p2.cocinar(coc,chef);
							do {
							System.out.println("Que deseas hacer? 1.Cortar   2. Cocinar   3.Servir" );
							decision=s1.nextInt();
							switch(decision) {
							case 1:
								System.out.println("Espera! los ingredientes ya estan cortados");
								break;
							case 2:
								System.out.println("Espera! los ingredientes ya estan cocinados");
								break;
							case 3:
								p2.servirMO(chef);
								System.out.println("¡Hurra! El plato estaba delicioso");
								break;
							} 
							}while(decision!=3);
							
							}
							
							
							else {
							p2.cocinarMO(chef);
							do {
							System.out.println("Que deseas hacer? 1.Cortar   2. Cocinar   3.Servir" );
							decision=s1.nextInt();
							switch(decision) {
							case 1:
								System.out.println("Espera! los ingredientes ya estan cortados");
								break;
							case 2:
								System.out.println("Espera! los ingredientes ya estan cocinados");
								break;
							case 3:
								p2.servirMO(chef);
								System.out.println("\"¡Hurra! El plato estaba delicioso");
								break;
							}
							}while(decision!=3);
							}
						case 3:
							System.out.println("Espera! los ingredientes aun no estan cocinados");
							break;
							
							}
						} while (decision!=2);
					}
					else {
					p2.cortarMO(chef);	
					
					System.out.println("Que deseas hacer? 1.Cortar   2. Cocinar   3.Servir" );
					decision=s1.nextInt();
						switch(decision) {
						case 2: 
							System.out.println("Si desean que lo haga "+ coc.nombre + " solo, introduzca 1, si desea el que Magnus opus le ayude, introduzca 2." );
							decision=s1.nextInt();
							if (decision==1) {
							p2.cocinar(coc,chef);
							
							}
							else {
							p2.cocinarMO(chef);
							}
						}
					}
				case 2:
					System.out.println("Espera! Aun no haz cortado los ingredientes ");
					break;
				case 3:
					System.out.println("Espera! Aun no haz cortado ni cocinado los ingredientes ");
					break;
				}
			} while(decision!=1 ); break;
		}
		

		
		

	}

}
interface preparado {
	int estado=0;
	public void cortar(cortador cortador, magnusopus magnusopus);
	public void cocinar(cocinero cocinero, magnusopus magnusopus);
	public void servirMO(magnusopus magnusopus);
}

class omelette implements preparado {

	@Override
	public void cortar(cortador cortador, magnusopus magnusopus) {
		magnusopus.cortar(true, cortador);
		
	}
	public void cortarMO(magnusopus magnusopus){
		magnusopus.cortarsolo();
	}


	@Override
	public void cocinar(cocinero cocinero, magnusopus magnusopus) {
		magnusopus.cocinar(true, cocinero);
		
		}
	public void cocinarMO(magnusopus magnusopus){
			magnusopus.cortarsolo();
	}
		

	@Override
	public void servirMO(magnusopus magnusopus) {
		magnusopus.servir();

		
	}
	
}

class chilaquiles implements preparado {

	@Override
	public void cortar(cortador cortador, magnusopus magnusopus) {
		magnusopus.cortar(true, cortador);
		
	}
	public void cortarMO(magnusopus magnusopus){
		magnusopus.cortarsolo();
	}


	@Override
	public void cocinar(cocinero cocinero, magnusopus magnusopus) {
		magnusopus.cocinar(true, cocinero);
		
		}
	public void cocinarMO(magnusopus magnusopus){
			magnusopus.cortarsolo();
	}
		

	@Override
	public void servirMO(magnusopus magnusopus) {
		magnusopus.servir();

		
	}
	
}


abstract class robot {
	int bateria;
	String nombre;
	String id;
	String LW;
	
	
	
	public robot(String nombre, String id) {
		this.nombre = nombre;
		this.id = id;
		bateria=100;
		LW="ninguna";
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	public String getLW() {
		return LW;
	}
	public void setLW(String lW) {
		LW = lW;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public abstract void funcion (boolean ayuda);

	
	
}

class cortador extends robot {
	
	public cortador (String nombre, String id) {
		super(nombre, id);
		bateria=100;
		LW="ninguna";
	}

	@Override
	public void funcion(boolean ayuda) {
		if (ayuda) {
		System.out.println(nombre+" y Magnus Opus " + "han cortado los ingredientes");
		bateria = bateria-10;
		LW="Cortó";
		}
		else {
		System.out.println("Ha cortado los ingredientes");
		bateria=bateria-20;
		LW="Cortó";
		}
		
		
	}

}

class cocinero extends robot {
	
	public cocinero (String nombre, String id) {
		super(nombre, id);
		bateria=100;
		LW="ninguna";
	}

	@Override
	public void funcion(boolean ayuda) {
		if (ayuda) {
		System.out.println(nombre+" y Magnus Opus " + "han cocinado los ingredientes");
		bateria = bateria-10;
		LW="Cocinó";
		}
		else {
		System.out.println("Ha cocinado los ingredientes");
		bateria=bateria-20;
		LW="Cocinó";
		}
		
		
	}

}

class magnusopus extends robot {
	
	public magnusopus (String id) {
		super("Magnus opus", id);
		bateria=100;
		LW="ninguna";
	}
	
	public void cortar(boolean ayudar, cortador Robot){
			Robot.funcion(true);
			bateria=bateria-10;
			LW="Cortó";
	}
	public void cortarsolo() {
			
			System.out.println("Magnus opus ha cortado los ingredientes");
			bateria=bateria-20;
			LW="Cortó";
		
	}
	
	public void cocinar(boolean ayudar, cocinero Robot){

			Robot.funcion(true);
			bateria=bateria-10;
			LW="Cocinó";
		}
	public void cocinarsolo(boolean ayudar, cocinero Robot){
			System.out.println("Magnus opus ha cocinado los ingredientes");
			bateria=bateria-20;
			LW="Cocinó";
		}
	public void servir() {
		System.out.println("Magnus opus ha servido el platillo");
		bateria=bateria-15;
		LW="Cocinó";
	}

	public void funcion() {
		}


}