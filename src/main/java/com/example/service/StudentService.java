package com.example.service;

import com.example.dto.StudentDTO;

import java.util.List;

public interface StudentService
{
    StudentDTO addStudent(StudentDTO studentDTO);

    StudentDTO updateInterest(String interest);

    List<StudentDTO> groupByInterests(List<String> interests);
}
