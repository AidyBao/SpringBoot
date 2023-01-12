package com.aidybao.dao;

import com.aidybao.dao.BookDao;
import com.aidybao.domain.Book;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {

        //System.out.println(bookDao.getById(5));
        //使用MP查询方法
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {

        Book book = new Book();
        book.setType("save");
        book.setName("save");
        book.setDescription("save");
        bookDao.insert(book);
        System.out.println("保存成功");
    }

    @Test
    void testUpdate() {

        Book book = new Book();
        book.setId(12);
        book.setType("save");
        book.setName("Update");
        book.setDescription("save");
        bookDao.updateById(book);
        System.out.println("修改成功");
    }

    @Test
    void testDelete() {
        bookDao.deleteById(12);
        System.out.println("删除成功");
    }

    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
        System.out.println("所有数据");
    }

    //分页
    @Test
    void testGetPage() {
        IPage page = new Page(1,5);
        bookDao.selectPage(page,null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
        System.out.println(page.getPages());

    }

    //条件查询
    @Test
    void testGetBy() {
        //QueryWrapper手工录入属性名称
//        QueryWrapper<Book> qw = new QueryWrapper<>();
//        qw.like("name","spring") ;
//        bookDao.selectList(qw);

        //LambdaQueryWrapper录入属性名称
        String name = "spring";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
//       第一种写法
//        if(name != null) {
//            lqw.like(Book::getName,name);
//        }

        //第二种写法
        lqw.like(name != null,Book::getName,name);

        bookDao.selectList(lqw);
    }

}
