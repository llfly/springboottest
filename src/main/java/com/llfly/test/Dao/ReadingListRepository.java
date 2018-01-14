package com.llfly.test.Dao;

import com.llfly.test.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by fangyou on 2018/1/14.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long>{
    List<Book> findByReader(String reader);
}
