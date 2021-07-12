package com.example.demo.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Student;
import com.github.pagehelper.Page;

import lombok.extern.apachecommons.CommonsLog;

@RunWith(SpringRunner.class)
@CommonsLog
@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void testFindByPage() {
        Page<Student> students = studentService.findByPage(3, 2);//Query pageNo=1, pageSize=2
        assertEquals(students.getTotal(),9);
        assertEquals(students.getPages(),5);
        System.out.println(students.toString());
    }
}