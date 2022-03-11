package com.example.Library.repository;

import com.example.Library.entity.BooksEntity;
import org.springframework.data.repository.CrudRepository;


public interface BooksRepository extends CrudRepository<BooksEntity,Long> {

}
