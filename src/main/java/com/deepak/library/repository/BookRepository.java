package com.deepak.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deepak.library.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	Book findByid(int id);

	Book findByname(int name);

	@Query("select author from Book ")
	List<String> findallauthors();

	@Query("select c from Book c where c.author=:author")
	List<Book> findallbooksbyauthor(@Param("author") String author);
	
	
}
