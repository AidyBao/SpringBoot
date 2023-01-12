package com.aidybao.dao;

import com.aidybao.domain.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper

//第一种写法mybatis
//public interface BookDao {
//    @Select("select * from tbl_book where id = #{id}")
//    Book getById(Integer id);
//}

//第二种写法mybatis-plus
public interface BookDao extends BaseMapper<Book> {
    //MP中不用写查询语句
//    @Select("select * from tbl_book where id = #{id}")
//    Book getById(Integer id);
}