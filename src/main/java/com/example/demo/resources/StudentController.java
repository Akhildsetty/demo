package com.example.demo.resources;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return service.saveStudents(students);
    }

    @GetMapping("/findStudents")
    public List<Student> findStudents(){
        return service.getStudents();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @GetMapping("/findByName/{name}")
    public Student findByName(@PathVariable String name){
        return service.getStudentByName(name);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable int id){
        service.deleteStudent(id);
    }

    @PutMapping("/update")
    public Student update(@RequestBody Student student){
        return service.update(student);
    }



}
