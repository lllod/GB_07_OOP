package seminar5.service;

import seminar5.model.Student;
import seminar5.model.StudentsGroup;
import seminar5.model.Teacher;

import java.util.List;

public class StudentsGroupServiceImpl implements StudentsGroupService {
    static Integer idGenerator = 1;

    @Override
    public StudentsGroup createStudentsGroup(List<Student> students, Teacher teacher) {
        StudentsGroup studentsGroup = new StudentsGroup();
        studentsGroup.setStudentsList(students);
        studentsGroup.setTeacher(teacher);
        studentsGroup.setStudentsGroupID(idGenerator++);
        return studentsGroup;
    }

    @Override
    public void getStudentsGroup(StudentsGroup studentsGroup) {
        System.out.println("Students Group: " + studentsGroup.getStudentsGroupID());
        System.out.println(studentsGroup.getTeacher());
        for (Student student: studentsGroup.getStudentsList()) {
            System.out.println("\t" + student);
        }
    }
}
