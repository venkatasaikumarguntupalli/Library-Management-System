package com.example.Library.repository;

import com.example.Library.entity.UserBookHistoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBookHistoryRepository extends CrudRepository<UserBookHistoryEntity,Long> {

}
