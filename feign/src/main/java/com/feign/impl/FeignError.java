package com.feign.impl;

import com.entity.Student;
import com.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author beer_pig
 * @date 2020/2/13 - 12:01
 */
@Component
public class FeignError implements FeignProviderClient{
    @Override
    public Collection<Student> findAll() {
        return null;
    }


    @Override
    public String index() {
        return "服务器维护中……";
    }
}
