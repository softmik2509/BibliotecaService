package org.certificatic.ejercicio.biblioteca.model;

public class Libro {

	private String isbn;
	
	private String titulo;
	
	private String autor;
	
	private ClasificacionEnum clasificacion;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public ClasificacionEnum getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(ClasificacionEnum clasificacion) {
		this.clasificacion = clasificacion;
	}
		
}
