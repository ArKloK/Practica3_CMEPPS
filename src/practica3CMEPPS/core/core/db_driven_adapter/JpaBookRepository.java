package practica3CMEPPS.core.core.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import practica3CMEPPS.core.core.db_driven_adapter.domain.BookEntity;
import practica3CMEPPS.core.core.db_driven_adapter.jparepository.HAAJpaRepository;
import practica3CMEPPS.core.core.driven_ports.BookRepository;
import practica3CMEPPS.core.domain.Book;
import practica3CMEPPS.core.domain.BookDoesNotExistException;

@Component
public class JpaBookRepository implements BookRepository {

	@Autowired //enlaza repositorio y servicio

	private HAAJpaRepository haaJpaRepository;

	    @Override

	public Book findById(Long id) {

	Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);

	BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);

	return bookEntity.toBook();

	}

}
