package com.aidybao;


import com.aidybao.domain.Book;
import com.aidybao.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest

//@Transactional
@Transactional

//@Rollback(fale)数据回滚，@Rollback(true)数据不回滚
@Rollback(false)
public class DaoTest {
    @Autowired
    private BookService bookService;

    @Test
    void testSave() {

        Book book = new Book();
        book.setName("springboot");
        book.setType("springboot");
        book.setDescription("springboot");

        bookService.save(book);
    }
}
