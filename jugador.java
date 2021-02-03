public class jugador {
	
	
	private String nombre;
	private String apellido;
	private String posicion;
	private int dorsal;
	
	private String[] posiciones = {"Portero","Defensa","Centrocampista","Delantero"};
	
	
	public jugador(String nombre, String apellido,String posicion, int dorsal) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.posicion=posicion;
		this.dorsal=dorsal;
		
	}
	
	
	
	public void jugadoraleatorio(int numero) {
		
		String[] nombre = {"Raul","Antonio","Pedro","Joaquin","Sergio","Carlos","Cristiano","Jose Maria","Iker","Roberto"};
		String[] apellido = {"Gutierrez","Silva","Hernandez","Gonzalez","blanco","Da","Dos","Santos","Aveiro","Casillas",
				"Arbeloa","Coca","Alonso","Olano","blanco","Perez","Rodriguez","Venancio","Casimiro","Yazid"};
		
		String nombrealeatorio=nombre[(int) (Math.floor(Math.random() * (nombre.length)))];
		String apellidoaleatorio=apellido[(int) (Math.floor(Math.random() * (apellido.length)))]+ " "+ apellido[(int) (Math.floor(Math.random() * (apellido.length)))];
		
		String[] posiciones = {"Portero","Defensa","Centrocampista","Delantero"};
		
		
		String posicionaleatoria=posiciones[(int) (Math.floor(Math.random() * (posiciones.length)))];
		
		this.nombre=nombrealeatorio;
		
		this.apellido=apellidoaleatorio;
		
		this.posicion=posicionaleatoria;
		
		this.dorsal=numero;
	}
	
	
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public void setPosicion(String posicion) {
	this.posicion=posicion;
	}
	public void setDorsal(int dorsal) {
		this.dorsal=dorsal;
	}
public String getNombre() { 
		return this.nombre; 
	}
	
	public String getApellido() { 
		return this.apellido; 
	}
	
	public String getPosicion() {
		return this.posicion;
	}
	public int getDorsal() {
		return this.dorsal;
	}
	
	public void imprimirJugador() {
		System.out.println(this.dorsal+" "+this.nombre+" "+this.apellido+" "+this.posicion);
	}
}



