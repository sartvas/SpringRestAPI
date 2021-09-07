
package com.zaurtregulov.spring.rest.service;

import com.zaurtregulov.spring.rest.dao.BooksDao;
import com.zaurtregulov.spring.rest.entity.Books;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BooksServiceImpl implements BookService{
    
    @Autowired
    private BooksDao booksDao;
    
    @Override
    @Transactional
    public List<Books> showAllBooks(){
        return booksDao.showAllBooks();
    }
}
