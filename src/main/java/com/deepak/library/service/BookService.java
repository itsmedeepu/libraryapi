package com.deepak.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.library.entity.Book;
import com.deepak.library.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book saveBook(Book book) {

		return bookRepository.save(book);

	}
	public List<Book> findAllBooks() {

		return bookRepository.findAll();

	}

	public Book findBookByid(int id) {
		return bookRepository.findByid(id);
	}

	public List<String> findAllAuthor() {
		return bookRepository.findallauthors();
	}

	public List<Book> findBookByAuthor(String author) {
		return bookRepository.findallbooksbyauthor(author);
	}

	public Book deleteBook(int id) {
		Book b = findBookByid(id);
		if (b != null) {

			bookRepository.deleteById(id);
			return b;

		}
		return b;

	}

}
