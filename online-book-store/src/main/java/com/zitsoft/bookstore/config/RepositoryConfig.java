package com.zitsoft.bookstore.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.zitsoft.bookstore.entity.Book;
import com.zitsoft.bookstore.entity.BookCategory;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
	@Autowired
	private EntityManager entityManager;

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		// config.exposeIdsFor(new Class[] {Book.class,BookCategory.class}); // for specified classes only.
		
		// For all entity classes.
		config.exposeIdsFor(
				entityManager.getMetamodel()
								.getEntities()
								.stream()
								.map(Type::getJavaType)
								.toArray(Class[]::new));
	}
}
