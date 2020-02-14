package com.repository;

import com.entity.Student;

import java.util.Collection;

/**
 * @author beer_pig
 * @date 2020/2/11 - 13:41
 */
public interface StudentRepository {
    Collection<Student> findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);
}
