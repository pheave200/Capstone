package com.hfo.Capstone.models.data;

import com.hfo.Capstone.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface LibraryRepository extends CrudRepository<Book, Integer> {
}
