package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return studentRepository.saveAll(students);
    }


    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student getStudentByName(String name){
        return studentRepository.findByName(name);
    }

    public void deleteStudent(int id){
        Optional<Student> student=studentRepository.findById(id);
        if (student.isPresent()){
            studentRepository.delete(student.get());
        }
    }

    public Student update(Student student){
        Student existingStudent=studentRepository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setFees(student.getFees());
        existingStudent.setStatus(student.getStatus());
        existingStudent.setRollNumber(student.getRollNumber());
        existingStudent.setStudies(student.getStudies());

        return studentRepository.save(existingStudent);
    }
}

