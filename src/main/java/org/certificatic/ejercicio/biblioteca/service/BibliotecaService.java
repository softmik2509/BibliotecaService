package org.certificatic.ejercicio.biblioteca.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.ejercicio.biblioteca.model.Libro;

/**
 * Capa de servicio
 * @author Miguel Vega
 *
 */

@WebService
public interface BibliotecaService {

	/**
	 * Permite dar de alta un libro
	 * @param libro
	 * @return libro registrado
	 */
	Libro registrarLibro(Libro libro);
	
	/**
	 * Permite consultar el catalogo de libros
	 * @return lista de libros
	 */
	List<Libro> consultarLibros();
	
	/**
	 * Permite buscar por isbn
	 * @param isbn
	 * @return libro encontrado
	 */
	Libro consultarPorIsbn(String isbn);
	
	/**
	 * Permite dar de baja un libro
	 * @param isbn
	 * @return true si lo borra o false en caso contrario
	 */
	boolean borrarLibro(String isbn);
}
