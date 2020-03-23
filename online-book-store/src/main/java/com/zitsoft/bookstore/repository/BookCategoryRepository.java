package com.zitsoft.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zitsoft.bookstore.entity.BookCategory;
/**
 * @author Md Nazish
 *Override the default endpoints to custom endpoints by using @RepositoryRestResource
 */
@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
