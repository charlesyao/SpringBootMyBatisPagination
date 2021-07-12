package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Student;
import com.github.pagehelper.Page;

@Mapper
public interface StudentMapper {

    Page<Student> findByPage();
}