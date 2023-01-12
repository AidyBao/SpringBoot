package com.aidybao.service;

import com.aidybao.domain.Book;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IBookService extends IService<Book> {

    Boolean saveBook(Book book);

    Boolean modify(Book book);

    Boolean delete(Integer id);


    IPage<Book> getPage(int currentPage, int pageSize);
}
