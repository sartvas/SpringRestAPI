package com.zaurtregulov.spring.rest.dao;

import com.zaurtregulov.spring.rest.entity.Books;

import java.util.List;

public interface BooksDao {
    
    public List<Books> showAllBooks();
}
