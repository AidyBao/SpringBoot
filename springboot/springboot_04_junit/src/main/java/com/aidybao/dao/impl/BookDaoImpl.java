package com.aidybao.dao.impl;

import com.aidybao.dao.BookDao;
import org.springframework.stereotype.Repository;

//要让这个类受spring管理，就需要让BookDaoImpl成为一个bean
@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao is running");
    }
}
