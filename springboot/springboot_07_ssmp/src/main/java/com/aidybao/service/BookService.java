package com.aidybao.service;

import com.aidybao.domain.Book;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage, int pageSize);
}
