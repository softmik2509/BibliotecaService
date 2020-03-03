package org.certificatic.ejercicio.biblioteca.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.ejercicio.biblioteca.model.Libro;
import org.certificatic.ejercicio.biblioteca.repository.BibliotecaRepository;
import org.certificatic.ejercicio.biblioteca.repository.BibliotecaRepositoryImpl;

@WebService(endpointInterface = "org.certificatic.ejercicio.biblioteca.service.BibliotecaService")
public class BibliotecaServiceImpl implements BibliotecaService {
	
	private static BibliotecaRepository repository = new BibliotecaRepositoryImpl();

	@Override
	public Libro registrarLibro(Libro libro) {
		return repository.registrar(libro);
	}

	@Override
	public List<Libro> consultarLibros() {
		return repository.consultarTodos();
	}

	@Override
	public Libro consultarPorIsbn(String isbn) {
		return repository.consultar(isbn);
	}

	@Override
	public boolean borrarLibro(String isbn) {
		return repository.borrar(isbn);
	}

}
