package com.jk.dao;

import com.jk.pojo.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yuan on 2017/5/28.
 */

public interface IStudentDao {


    //@Select("select * from student where name = #{name}")
    public List<Student> insert(String name) ;


}
