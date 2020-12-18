package com.example.api;

import com.example.dto.StudentDTO;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpStatus.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
@CrossOrigin
public class StudentAPI
{
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public ResponseEntity<List<StudentDTO>> getAll()
    {
        List<StudentDTO> students = studentService.getStudents();
        return new ResponseEntity<>(students, OK);
    }


    @PostMapping("/student")
    public ResponseEntity<StudentDTO> addStudent(@RequestBody StudentDTO studentDTO)
    {
        StudentDTO added = studentService.addStudent(studentDTO);
        return new ResponseEntity<>(added, CREATED);
    }

    @PutMapping("/student/{id}/{interest}")
    public ResponseEntity<StudentDTO> updateInterest(@PathVariable String id, @PathVariable String interest)
    {
        StudentDTO student = studentService.updateInterest(id, interest);
        return new ResponseEntity<>(student, OK);
    }
}
