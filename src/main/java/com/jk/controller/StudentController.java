package com.jk.controller;

import com.github.pagehelper.PageHelper;
import com.jk.pojo.Student;
import com.jk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yuan on 2017/5/28.
 */
//@RestController
    @Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/select")
    @ResponseBody
    public List<Student> selects(String name){

        PageHelper.startPage(1,2);
        List<Student> aa =  studentService.select(name);

        System.out.print("ss");
        return aa;
    }

    @RequestMapping("/index")

    public String index(ModelMap modelMap){

        modelMap.put("toUserName","yuan");
        return "index";
    }


}
