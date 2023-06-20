package seminar5.controller;

import seminar5.model.Student;
import seminar5.model.StudentsGroup;
import seminar5.model.Teacher;
import seminar5.service.StudentServiceImpl;
import seminar5.service.StudentsGroupService;
import seminar5.service.StudentsGroupServiceImpl;

import java.util.List;

public class Controller {
    StudentServiceImpl studentService;
    StudentsGroupServiceImpl studentsGroupServiceImpl;

    public Controller() {
        this.studentService = new StudentServiceImpl();
        this.studentsGroupServiceImpl = new StudentsGroupServiceImpl();
    }

    public StudentsGroup createStudentsGroup(List<Student> studentsList, Teacher groupTeacher) {
        return studentsGroupServiceImpl.createStudentsGroup(studentsList, groupTeacher);
    }

    public Student createStudent(String studentName, Integer studentBirth) {
        return this.studentService.createStudent(studentName, studentBirth);
    }

    public void read(StudentsGroup studentsGroup) {
        studentsGroupServiceImpl.getStudentsGroup(studentsGroup);
    }

}