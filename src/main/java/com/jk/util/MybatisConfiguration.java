package com.jk.util;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by yuan on 2017/5/28.
 */
@Configuration
public class MybatisConfiguration {


    @Bean
    public PageHelper pageHelper(){

        System.out.print("调用分页插件");
        PageHelper pageHelper = new PageHelper();

        Properties p = new Properties();

        p.setProperty("offsetAsPageNum","true");
        p.setProperty("rowBoundsWithCount","true");

        p.setProperty("reasonable","true");

        pageHelper.setProperties(p);

        return pageHelper;
    }
















}
