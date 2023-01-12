package com.aidybao.service;

import com.aidybao.domain.Book;
import org.springframework.context.annotation.Bean;

public interface BookService {

    public boolean save(Book book);
}
