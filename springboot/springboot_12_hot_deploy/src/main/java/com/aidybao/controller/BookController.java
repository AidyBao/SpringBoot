package com.aidybao.controller;

import com.aidybao.domain.Book;
import com.aidybao.service.IBookService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.list();
    }

    //@PostMapping 请求方式
    //@RequestBody 请求体参数
    @PostMapping
    public Boolean save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book) {
        return  bookService.modify(book);
    }


    //@PathVariable从路径中获取变量
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id) {
        return  bookService.delete(id);
    }

    //@PathVariable从路径中获取变量
    //http:localhost/books/2
    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id) {
        return  bookService.getById(id);
    }


    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage, int pageSize) {
        return  bookService.getPage(currentPage, pageSize);
    }
}