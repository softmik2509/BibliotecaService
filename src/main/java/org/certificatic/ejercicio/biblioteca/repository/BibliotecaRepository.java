package org.certificatic.ejercicio.biblioteca.repository;

import java.util.List;

import org.certificatic.ejercicio.biblioteca.model.Libro;

/**
 * Acceso a datos
 * @author Miguel Vega
 *
 */
public interface BibliotecaRepository {

	/**
	 * Permite dar de alta un libro
	 * @param libro
	 * @return libro registrado
	 */
	Libro registrar(Libro libro);
	
	/**
	 * Permite consultar el catalogo de libros
	 * @return lista de libros
	 */
	List<Libro> consultarTodos();
	
	/**
	 * Permite buscar por isbn
	 * @param isbn
	 * @return libro encontrado
	 */
	Libro consultar(String isbn);
	
	/**
	 * Permite dar de baja un libro
	 * @param isbn
	 * @return true si lo borra o false en caso contrario
	 */
	boolean borrar (String isbn);
}
