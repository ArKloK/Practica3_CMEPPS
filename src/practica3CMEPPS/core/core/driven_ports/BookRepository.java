package practica3CMEPPS.core.core.driven_ports;

import practica3CMEPPS.core.domain.Book;

public interface BookRepository {
	
	Book findById(Long id);

}
