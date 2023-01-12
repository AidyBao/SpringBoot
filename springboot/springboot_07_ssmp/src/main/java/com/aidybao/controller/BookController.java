package com.aidybao.controller;

import com.aidybao.controller.utils.R;
import com.aidybao.domain.Book;
import com.aidybao.service.IBookService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll() {
        return new R(true, bookService.list());
    }

    //@PostMapping 请求方式
    //@RequestBody 请求体参数
    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
       if (book.getName().equals("123")) throw new IOException();
       boolean flag = bookService.save(book);
       return new R(flag,flag ? "添加成功" : "添加失败");
    }

    @PutMapping
    public R update(@RequestBody Book book) throws IOException {
        if (book.getName().equals("123")) throw new IOException();
        boolean flag = bookService.modify(book);
        return new R(flag,flag ? "修改成功" : "修改失败");
    }


    //@PathVariable从路径中获取变量
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return  new R(bookService.delete(id));
    }

    //@PathVariable从路径中获取变量
    //http:localhost/books/2
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true,bookService.getById(id));
    }


    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, int pageSize) {
        //return  bookService.getPage(currentPage, pageSize);

        return new R(true,bookService.getPage(currentPage, pageSize));
    }

}
