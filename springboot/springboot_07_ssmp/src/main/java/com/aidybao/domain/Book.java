package com.aidybao.domain;

//生成getter and setter, tostring, hashcode, equals
import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
