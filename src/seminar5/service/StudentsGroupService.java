package seminar5.service;

import seminar5.model.Teacher;
import seminar5.model.Student;
import seminar5.model.StudentsGroup;

import java.util.List;

public interface StudentsGroupService {
    public StudentsGroup createStudentsGroup(List<Student> students, Teacher teacher);

    public void getStudentsGroup(StudentsGroup studentsGroup);
}
