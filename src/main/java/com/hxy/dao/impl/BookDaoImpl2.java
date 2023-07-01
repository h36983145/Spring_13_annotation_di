package com.hxy.dao.impl;

import com.hxy.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao save ...2");
    }
}
