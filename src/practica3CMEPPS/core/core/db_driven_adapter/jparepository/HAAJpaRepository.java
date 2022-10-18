package practica3CMEPPS.core.core.db_driven_adapter.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import practica3CMEPPS.core.core.db_driven_adapter.domain.BookEntity;

public interface HAAJpaRepository extends JpaRepository<BookEntity, Long> {}
