package com.zaurtregulov.spring.rest.dao;

import com.zaurtregulov.spring.rest.entity.Books;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BooksDaoImpl implements BooksDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Books> showAllBooks() {
        
        Session session = sessionFactory.getCurrentSession();
        Query<Books> query = session.createQuery("from Books", Books.class);
        List<Books> getAllBooks = query.getResultList();
        
        return getAllBooks;
    }

    }
  
