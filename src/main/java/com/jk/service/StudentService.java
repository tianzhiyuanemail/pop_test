package com.jk.service;

import com.jk.dao.IStudentDao;
import com.jk.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuan on 2017/5/28.
 */
@Service
public class StudentService {

    @Autowired
    private IStudentDao istudentDao;

    public List<Student> select(String name ){

        return istudentDao.insert(name);

    }



}
