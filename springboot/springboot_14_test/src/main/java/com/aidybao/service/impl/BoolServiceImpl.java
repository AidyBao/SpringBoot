package com.aidybao.service.impl;

import com.aidybao.dao.BookDao;
import com.aidybao.domain.Book;
import com.aidybao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service bean
@Service
public class BoolServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }
}
