package com.jk.pojo;

import java.io.Serializable;

/**
 * Created by yuan on 2017/5/28.
 */
public class Student implements Serializable{

    private Integer id;
    private String  name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
