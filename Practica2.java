import java.util.*;
 // @author Fernando Esqueda
public class Practica2 
{
    
    public static void main(String[] args)
    {     
        
        
        Estudiante arr[]= {new Estudiante("Luis","01262059","Matematicas", (float) 60.25),  //Se crea un array de objetos
        		new Estudiante("Fernando","01262070","Calculo diferencial", (float) 13.12),
        		new Estudiante("Roberto","01262027","Ingles", (float) 55.85),
        		new Estudiante("Miguel","01262068","Español", (float) 99.47),
        		new Estudiante("Jorge","01262055","Valores", (float) 70.99), //Estos son los 5 objetos predefinidos por mi
        		new Estudiante(CapMen.NxSt("Nombre del estudiante: "),CapMen.NxSt("Matricula del estudiante: "),CapMen.NxSt("Materia: "), CapMen.NxFt("Cual es la calificacion: ")),
        		new Estudiante(CapMen.NxSt("Nombre del estudiante: "),CapMen.NxSt("Matricula del estudiante: "),CapMen.NxSt("Materia: "), CapMen.NxFt("Cual es la calificacion: ")),
        		new Estudiante(CapMen.NxSt("Nombre del estudiante: "),CapMen.NxSt("Matricula del estudiante: "),CapMen.NxSt("Materia: "), CapMen.NxFt("Cual es la calificacion: ")),
        		new Estudiante(CapMen.NxSt("Nombre del estudiante: "),CapMen.NxSt("Matricula del estudiante: "),CapMen.NxSt("Materia: "), CapMen.NxFt("Cual es la calificacion: ")),
        		new Estudiante(CapMen.NxSt("Nombre del estudiante: "),CapMen.NxSt("Matricula del estudiante: "),CapMen.NxSt("Materia: "), CapMen.NxFt("Cual es la calificacion: "))}; //estos son los otros 5 objetos que el usuario definira
        for (int i=0; i<arr.length;i++)
        {
        	System.out.println(arr[i]); //aqui se imprime los valores de los objetos mediante el toString
        }
        
        
    }
        
   
    
}

class Estudiante
{
    String Nombre, id, materia, estado;
    float calificacion;  

    public Estudiante(String Nombre, String id, String materia, float calificacion)  //constructor
    {
        this.Nombre = Nombre; //atributos
        this.id = id;
        this.materia = materia;
        this.calificacion = calificacion;
        if(calificacion<60)
            {
                estado = "REPROBADO";
            }
        else 
            {
                estado="APROBADO";
            }
    }

    public String toString() //metodo para imprimir cada uno de los atributos del objeto
    {
		return " Nombre: " + Nombre +  " id: " + id + " Materia:  " + materia + " Estado " + estado + " Calificacion " + Float.toString(calificacion);
    	
    }

}

class CapMen //Esta clase es para mandar un mensaje y scanear un valor 
{
    
    public static float NxFt(String mensaje)
    {  
        System.out.println(mensaje);
        Scanner ent = new Scanner(System.in);
        return(ent.nextFloat());
    
        
        
    }
    public static String NxSt(String mensaje) 
    {
        System.out.println(mensaje);
        Scanner ent = new Scanner(System.in);
        return(ent.nextLine());
    }


}
