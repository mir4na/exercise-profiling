package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.model.Course;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentCourseRepository studentCourseRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository,
                          StudentCourseRepository studentCourseRepository) {
        this.studentRepository = studentRepository;
        this.studentCourseRepository = studentCourseRepository;
    }

    public List<StudentCourse> getAllStudentsWithCourses() {
        return studentRepository.findAll().stream()
                .flatMap(student -> studentCourseRepository.findByStudentId(student.getId()).stream()
                        .map(studentCourse -> mapToStudentCourse(student, studentCourse.getCourse())))
                .collect(Collectors.toList());
    }

    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findAll().stream()
                .max(Comparator.comparing(Student::getGpa));
    }

    public String joinStudentNames() {
        return studentRepository.findAll().stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }

    private StudentCourse mapToStudentCourse(Student student, Course course) {
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setStudent(student);
        studentCourse.setCourse(course);
        return studentCourse;
    }
}