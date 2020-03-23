package com.zitsoft.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zitsoft.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
