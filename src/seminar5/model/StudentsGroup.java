package seminar5.model;

import seminar5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private List<Student> studentsList;
    private Teacher teacher;
    private Integer studentsGroupID;

    public StudentsGroup() {
        this.studentsList = new ArrayList<>();
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public Integer getStudentsGroupID() {
        return studentsGroupID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void setStudentsGroupID(Integer studentsGroupID) {
        this.studentsGroupID = studentsGroupID;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
