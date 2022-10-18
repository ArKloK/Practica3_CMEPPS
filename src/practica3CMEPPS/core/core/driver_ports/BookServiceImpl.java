package practica3CMEPPS.core.core.driver_ports;

import practica3CMEPPS.core.core.driven_ports.BookRepository;
import practica3CMEPPS.core.domain.Book;

public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {

		this.bookRepository = bookRepository;

	}

	@Override
	public Book getBook(Long id) {
		return bookRepository.findById(id);
	}

}
