package co.edu.unbosque.model;

import java.io.File;
import java.io.Serializable;

public class JugadorDTO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int edad;
	private String genero;
	private int puntaje;
	private String id;
		
		public JugadorDTO(String string, int i, String string2, int j,String id) {
		// TODO Auto-generated constructor stub
			this.nombre= string;
			this.edad =i;
			this.genero=string2;
			this.puntaje=j;
			this.id=id;
	}
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	

}
