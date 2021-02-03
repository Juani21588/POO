import java.util.Scanner;

public class principal {
	
	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce el numero de jugadores que desea");
			
		int numerojugadores= sc.nextInt();
		
		jugador [] plantilla=GenerarEquipo(numerojugadores); 
		
		
		
		for(jugador rea:plantilla) {
			rea.imprimirJugador();
			
			
		}
	
		}
	public static String aleatoriaNombre() {
		
 		
		String[] nombre = {"Raul","Antonio","Pedro","Joaquin","Sergio","Carlos","Cristiano","Jose Maria","Iker","Roberto"};
		String [] numerosalea=new String[1];

	 return nombre[(int) (Math.floor(Math.random() * (nombre.length)))];
	}
	public static String aleatoriaApellidos() {
		
		String[] apellido = {"Gutierrez","Silva","Hernandez","Gonzalez","blanco","Da","Dos","Santos","Aveiro","Casillas",
			"Arbeloa","Coca","Alonso","Olano","blanco","Perez","Rodriguez","Venancio","Casimiro","Yazid"};
	String [] numerosalea=new String[2];

 return apellido[(int) (Math.floor(Math.random() * (apellido.length)))]+" "+apellido[(int) (Math.floor(Math.random() * (apellido.length)))];
}	

public static String aleatorioPosicion() {
	String[] posiciones = {"Portero","Defensa","Centrocampista","Delantero"};
	
	return posiciones[(int) (Math.floor(Math.random() * (posiciones.length-1)))];
}

	
	
	public static jugador[] GenerarEquipo(int numerojugadores) {
		
		jugador[] equipo = new jugador[numerojugadores];
		
		for(int i=0;i<numerojugadores;i++) {
			String nombre=aleatoriaNombre();
			String apellido=aleatoriaApellidos();
			String posicion=aleatorioPosicion();
			int dorsal=i;
			equipo[i]= new jugador(nombre,apellido,posicion,i+1);
			
			
			
		}
		return  equipo;
	}
	
	
	public static String DesordenarEquipo() {
	return "";
	}
	public static String BuscarJugador() {
		return "";
	}
	public static String OrdenarEquipo() {
		return "";
	}
}