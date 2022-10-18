package practica3CMEPPS;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import practica3CMEPPS.core.core.driven_ports.BookRepository;
import practica3CMEPPS.core.core.driver_ports.BookService;
import practica3CMEPPS.core.core.driver_ports.BookServiceImpl;

@Configuration
public class SpringBeans {
	@Bean
	BookService bookService(final BookRepository bookRepository) {
		return new BookServiceImpl(bookRepository);

	}
}
