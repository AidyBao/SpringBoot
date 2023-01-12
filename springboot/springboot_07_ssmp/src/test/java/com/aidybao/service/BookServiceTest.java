package com.aidybao.service;

import com.aidybao.domain.Book;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(4));
    }


    @Test
    void testSave() {

        Book book = new Book();
        book.setType("save");
        book.setName("save");
        book.setDescription("save");
        bookService.save(book);
        System.out.println("保存成功");
    }

    @Test
    void testUpdate() {

        Book book = new Book();
        book.setId(12);
        book.setType("save");
        book.setName("Update");
        book.setDescription("save");
        bookService.updateById(book);
        System.out.println("修改成功");
    }

    @Test
    void testDelete() {
        bookService.removeById(16);
        System.out.println("删除成功");
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.list());
        System.out.println("所有数据");
    }

    //分页
    @Test
    void testGetPage() {
        IPage<Book> page = new Page<>(2,5);
        IPage<Book> page1 = bookService.page(page);

        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
        System.out.println(page.getPages());

    }
}
