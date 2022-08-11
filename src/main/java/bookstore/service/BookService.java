package bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.dto.MessageResponseDTO;
import bookstore.entity.Book;
import bookstore.repository.BookRepository;

@Service
public class BookService {

	
	private BookRepository bookRepository;

	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public MessageResponseDTO create(Book book) {
		Book savedBook = bookRepository.save(book);
		return MessageResponseDTO.builder().message("Book created with Id " + savedBook.getId()).build();
	}
	
}
