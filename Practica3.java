
import java.util.Scanner;

public class Practica3 {
	
	public static void main (String[] args)
	{ 	
		//le pido al usuario los datos
		ManejoDeDatos.setNombres(PedirDatos.dStr("Nombre/s"));
		ManejoDeDatos.setApellidos(PedirDatos.dStr("Apellidos"));
		ManejoDeDatos.setSexo(PedirDatos.dStr("Sexo"));
		ManejoDeDatos.setOrigen(PedirDatos.dStr("Estado de origen"));
		
		ManejoDeDatos.setAño(PedirDatos.dStr("Año de nacimiento"));
		ManejoDeDatos.setMes(PedirDatos.dStr("Mes"));
		ManejoDeDatos.setDia(PedirDatos.dStr("Dia"));
		
		//se crean los objetos para la curp, rfc y los dos
		String curp = ManejoDeDatos.Curp();
		String rfc= ManejoDeDatos.RFC();
		String curprfc=curp+rfc;
		System.out.println(curp);
		System.out.println(rfc);
		System.out.println(curprfc);
		
		
		

	}

}
class ManejoDeDatos
{
	static String Nombres, Apellidos, Sexo, Origen;
	static String Año, Dia, Mes;
	static String CURP= new String();
	static String RFC= new String();
	

	//setter getters
	public static String getApellidos() {
		return Apellidos;
	}
	public static void setApellidos(String apellidos) {
		Apellidos = apellidos.toLowerCase();
	}
	public String getNombres() {
		return Nombres;
	}
	public static void setNombres(String nombre) {
		Nombres = nombre.toLowerCase();
	}
	public String getSexo() {
		return Sexo;
	}
	public static void setSexo(String sexo) {
		Sexo = sexo.toLowerCase();
	}
	public String getOrigen() {
		return Origen;
	}
	public static void setOrigen(String origen) {
		Origen = origen.toLowerCase();
	}
	public String getAño() {
		return Año;
	}
	public static void setAño(String año) {
		Año = año;
	}
	public String getDia() {
		return Dia;
	}
	public static void setDia(String dia) {
		Dia = dia;
	}
	public String getMes() {
		return Mes;
	}
	public static void setMes(String mes) {
		Mes = mes;
	}
	//funcion que devuelva el estado a 2 caracteres
	public static String EntregarEstado() 
	{ 	String abreviatura="";
		switch (Origen.toLowerCase()) 
		{
		case "aguascalientes":
			abreviatura="AS"; break;
		case "baja california":
			abreviatura="BC";break;
		case "baja california Sur":
			abreviatura="BS";break;
		case "campeche":
			abreviatura="CC";break;
		case "chiapas":
			abreviatura="CS";break;
		case "chihuahua":
			abreviatura="CH";break;
		case "ciudad de mexico":
			abreviatura="DF";break;
		case "coahuila":
			abreviatura="CL";break;
		case "colima":
			abreviatura="CM";break;
		case "durango":
			abreviatura="DG";break;
		case "guanajuato":
			abreviatura="GT";break;
		case "guerrero":
			abreviatura="GR";break;
		case "hidalgo":
			abreviatura="HG";break;
		case "jalisco":
			abreviatura="JC";break;
		case "mexico":
			abreviatura="MC";break;
		case "michoacan":
			abreviatura="MN";break;
		case "morelos":
			abreviatura="MS";break;
		case "nayarit":
			abreviatura="NT";break;
		case "nuevo leon":
			abreviatura="NL";break;
		case "oaxaca":
			abreviatura="OC";break;
		case "puebla":
			abreviatura="PL";break;
		case "queretaro":
			abreviatura="QO";break;
		case "quintara roo":
			abreviatura="QR";break;
		case "san luis potosi":
			abreviatura="SP";break;
		case "sinaloa":
			abreviatura="SL";break;
		case "sonora":
			abreviatura="SR";break;
		case "tabasco":
			abreviatura="TC";break;
		case "tamaulitas":
			abreviatura="TS";break;
		case "tlaxcala":
			abreviatura="TL";break;
		case "veracruz":
			abreviatura="VZ";break;
		case "yucatan":
			abreviatura="YN";break;
		case "zacatecas":
			abreviatura="ZS";break;
			
			
			
		
		
		
		}
	
		
		return abreviatura;
	}
	//funcion que devuelve los primeros 4 chars de la curp
	public static String BuscarChars()
	{	
		int x=0;
		char dato1, dato3 = 0, dato4;
                char dato2 = 0;
		String vocales="aeiou";
		String Resultado;
		dato1=Apellidos.charAt(0);
		dato4=' ';
		
		
		for (int i=1; i<Apellidos.length(); i++) 
		{	
			
			for(int j=0; j<5;j++)
			{
				if (Apellidos.charAt(i)==vocales.charAt(j))
			{
					dato2=Apellidos.charAt(i);
					x=1;
			}
			
				
			}
			
			if (x==1) 
			{
				break;
			}
			
		}
		
		for (int i =0; i<Apellidos.length(); i++) 
		{ 	
			
			if ((Apellidos.charAt(i))==dato4)
			{
				dato3=Apellidos.charAt(i+1);
				
			}
			
		}
		
		
		Resultado= "" + dato1 + dato2 + dato3 + Nombres.charAt(0);
		
		return Resultado;
	}
	//funcion que devuelve las consonantes de la curp, despues del estado a dos caracteres
	public static String BuscarChars2()
	{	
		int x=0, y=0;
		char dato1, dato3 = 0, dato4;
                char dato2 = 0;
		String vocales="aeiou";
		String consonantes="bcdfghjklmnpqrstvxyzñ";
		String Resultado;
		dato1=Apellidos.charAt(0);
		dato4=' ';
		
		
		for (int i=1; i<Apellidos.length(); i++) 
		{	
			
			for(int j=0; j<21;j++)
			{
				if (Apellidos.charAt(i)==consonantes.charAt(j))
			{
					dato1=Apellidos.charAt(i);
					x=1;
			}
			
				
			}
			
			if (x==1) 
			{
				break;
			}
			
		}
		x=0;
		
		for (int i =0; i<Apellidos.length(); i++) 
		{ 	
			
			if ((Apellidos.charAt(i))==dato4||y==1)
			{	y=1;
				for(int j=0; j<21;j++)
				{
					if (Apellidos.charAt(i+2)==consonantes.charAt(j))
				{
						dato2=Apellidos.charAt(i+2);
						x=1;
				}
				
					if (x==1) 
					{
						break;
					}
					
				}
				
				
			}
			if (x==1) 
			{
				break;
			}
			
		}
		x=0;
		
		for (int i=1; i<Nombres.length(); i++) 
		{	
			
			for(int j=0; j<21;j++)
			{
				if (Nombres.charAt(i)==consonantes.charAt(j))
			{
					dato3=Nombres.charAt(i);
					x=1;
			}
			
				
			}
			
			if (x==1) 
			{
				break;
			}
			
		}
		
		
		Resultado= "" + dato1 + dato2 + dato3 ;
		
		return Resultado;
	}
	
	
	//aqui se juntan todos los datos necesarios para hacer la curp
	public static String Curp() 
	{	String CURP=".",CURP2=".";
		int i1 = (int) Math.floor(Math.random()*10);
		int i2 = (int) Math.floor(Math.random()*10);
		
		CURP=BuscarChars();
		CURP2=Año.charAt(2)+""+Año.charAt(3)+Mes+Dia+Sexo.charAt(0)+EntregarEstado()+BuscarChars2()+ i1 + i2;
		
		CURP=CURP.toUpperCase();
		CURP2=CURP2.toUpperCase();
		
		
		
		return CURP+CURP2;
	}
	//aqui se juntan todos los datos necesarios para hacer el RFC
	public static String RFC() 
	{	String RFC;
		String homoclave = "qwertyuioplkjhgfdsazxcvbnmñ1234567890";
		RFC=BuscarChars()+Año.charAt(2)+""+Año.charAt(3)+Mes+Dia+ homoclave.charAt((int) Math.floor(Math.random()*homoclave.length())) + homoclave.charAt((int) Math.floor(Math.random()*homoclave.length())) + homoclave.charAt((int) Math.floor(Math.random()*homoclave.length()));
		RFC=RFC.toUpperCase();
		
		return RFC;
	}



}



//clase para solicitar datos al usuario
class PedirDatos 
{
	public static String dStr(String msg) 
	{	String Str;
		Scanner introduce = new Scanner(System.in);
		System.out.println(msg + ": ");
		Str=introduce.nextLine();
		return Str;
	}
	
	public static int dInt(String msg) 
	{	int Valor;
		Scanner introduce = new Scanner(System.in);
		System.out.println(msg + ": ");
		Valor=introduce.nextInt();
		return Valor;
	}
	
}