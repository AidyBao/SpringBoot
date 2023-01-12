package com.aidybao.controller;

//import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class BaseClass {

//    private static final Logger log = Logger.getLogger(BookController.class.getName());

    private Class clazz = null;

    public static Logger log;


    public BaseClass() {
        clazz = this.getClass();
        log = LoggerFactory.getLogger(clazz);
    }

}
