package seminar5.service;

import seminar5.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    List<Student> studentsList;

    public StudentServiceImpl() {
        this.studentsList = new ArrayList<>();
    }

    @Override
    public Student createStudent(String studentName, Integer studentBirth) {
        return new Student(studentName, studentBirth);
    }
}

