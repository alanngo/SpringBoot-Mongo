package com.example.dto;

import com.example.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class StudentDTO
{
    private String id;
    private String name;
    private List<String> interests;

    public static StudentDTO toDTO(Student student)
    {
        return new StudentDTO(
                student.getId(),
                student.getName(),
                student.getInterests());
    }

    public static Student toEntity(StudentDTO studentDTO)
    {
        Student ret = new Student();
        ret.setInterests(studentDTO.getInterests());
        ret.setName(studentDTO.getName());
        return ret;
    }
}
