package com.deepak.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.library.entity.Book;
import com.deepak.library.service.BookService;

@RestController
public class LibraryController {

	@Autowired
	private BookService bookService;

	@PostMapping("/savebook")
	public @ResponseBody Book saveBook(@RequestBody Book book) {

		return bookService.saveBook(book);

	}

	@GetMapping("/findallbooks")
	public @ResponseBody List<Book> findallBooks() {

		return bookService.findAllBooks();
	}

	@GetMapping("/findbookbyid/{id}")
	public @ResponseBody Book findBookByid(@PathVariable("id") Integer id) {

		return bookService.findBookByid(id);
	}

	@GetMapping("/getallauthors")
	public @ResponseBody List<String> findallauthors() {
		return bookService.findAllAuthor();
	}

	@GetMapping("/getbookbyauthor")
	public @ResponseBody List<Book> findBookByAuthor(@RequestParam(name = "author") String author) {

		return bookService.findBookByAuthor(author);
	}

	@PutMapping("/updatebook")
	public @ResponseBody Book updateBook(@RequestBody Book book) {

		return saveBook(book);

	}
	
	@DeleteMapping("/delete")
	public @ResponseBody Book deleteBook(@RequestParam("id") int id) {
		return bookService.deleteBook(id);
	}

}
