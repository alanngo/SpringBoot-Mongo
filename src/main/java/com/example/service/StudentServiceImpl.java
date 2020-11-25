package com.example.service;

import com.example.dto.StudentDTO;
import com.example.entity.Student;
import static com.example.dto.StudentDTO.*;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service("studentService")
@Transactional
public class StudentServiceImpl  implements StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDTO addStudent(StudentDTO studentDTO)
    {
        Student added = studentRepository.save(toEntity(studentDTO));
        return  toDTO(added);
    }

    @Override
    public StudentDTO updateInterest(String interest) {
        return null;
    }

    @Override
    public List<StudentDTO> groupByInterests(List<String> interests) {
        return null;
    }
}
