package com.Hibernate.Dao;

//import org.hibernate.mapping.List;

public class BookService {
    private static BookDao bookDao;
    public BookService() {
        bookDao = new BookDao();
    }
    public void insert(Book entity) {
        bookDao.openCurrentSessionwithTransaction();
        bookDao.insert(entity);
        bookDao.closeCurrentSessionwithTransaction();
    }
    public void update(Book entity) {
        bookDao.openCurrentSessionwithTransaction();
        bookDao.update(entity);
        bookDao.closeCurrentSessionwithTransaction();
    }
    public Book findById(String id) {
        bookDao.openCurrentSession();
        Book book = bookDao.findById(id);
        bookDao.closeCurrentSession();
        return book;
    }
    public void delete(String id) {
        bookDao.openCurrentSessionwithTransaction();
        Book book = bookDao.findById(id);
        bookDao.delete(book);
        bookDao.closeCurrentSessionwithTransaction();
    }
    public java.util.List<Book> findAll() {
        bookDao.openCurrentSession();
        java.util.List<Book> books = bookDao.findAll();
        bookDao.closeCurrentSession();
        return books;
    }
    public void deleteAll() {
        bookDao.openCurrentSessionwithTransaction();
        bookDao.deleteAll();
        bookDao.closeCurrentSessionwithTransaction();
    }
    public BookDao bookDao() {
        return bookDao;
    }
}

