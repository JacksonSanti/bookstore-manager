package bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

	
	
}
