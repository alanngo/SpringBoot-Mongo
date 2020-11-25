package com.example.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document
@Data
public class Student
{
    @Id
    private String id;
    private String name;
    private List<String> interests;
}
