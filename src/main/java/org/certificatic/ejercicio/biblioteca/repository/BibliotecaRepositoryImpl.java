package org.certificatic.ejercicio.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;

import org.certificatic.ejercicio.biblioteca.model.ClasificacionEnum;
import org.certificatic.ejercicio.biblioteca.model.Libro;

public class BibliotecaRepositoryImpl implements BibliotecaRepository {

	private static List<Libro> libros = new ArrayList<Libro>();
	
	@Override
	public Libro registrar(Libro libro) {
		System.out.println("Registrar libro :::::");
		libros.add(libro);
		return libro;
	}

	@Override
	public List<Libro> consultarTodos() {
		System.out.println("Consultar todos los libros :::::");
		return libros;
	}

	@Override
	public Libro consultar(String isbn) {
		System.out.println("--- Consultar un libro ");
		Libro libro = null;
		try {
			libro = libros.stream().filter(lib -> lib.getIsbn().equals(isbn)).findFirst().get();
		}catch(Exception e) {
			System.out.println("Ocurrio un error al consultar libro");
			libro = new Libro();
			libro.setIsbn("NO ENCONTRADO");
			libro.setAutor("S/A");
			libro.setClasificacion(ClasificacionEnum.NA);
			libro.setTitulo("S/T");
		}
		return libro;
	}

	@Override
	public boolean borrar(String isbn) {
		Libro libro = consultar(isbn);
		if(libro.getIsbn() == "NO ENCONTRADO") {
			return false;
		}
		
		libros.remove(libro);
		System.out.println("Libro eliminado");
		return true;
	}

}
