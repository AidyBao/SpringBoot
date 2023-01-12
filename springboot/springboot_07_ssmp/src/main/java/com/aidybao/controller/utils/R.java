package com.aidybao.controller.utils;

import com.aidybao.domain.Book;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

//@Data生成getter and setter, tostring, hashcode, equals
@Data
public class R {
    private Boolean flag;
    private Object data;

    public R() {

    }

    //构造方法
    public R(Boolean flag) {
        this.flag = flag;
    }

    //构造方法
    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
