package seminar5;

import seminar5.controller.Controller;
import seminar5.model.Disciples;
import seminar5.model.Student;
import seminar5.model.StudentsGroup;
import seminar5.model.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Teacher firstTeacher = new Teacher("Иванов Иван Иванович", 1977, Disciples.GEOGRAPHY);
        Student firstStudents = new Student("Дмитриев Дмитрий Дмитриевич", 2013);
        Student secondStudent = new Student("Александрова Александра Александровна", 2013);
        Student thirdStudent = new Student("Петров Петр Петрович", 2014);
        List<Student> firstStudentsGroup = new ArrayList<>(Arrays.asList(firstStudents, secondStudent, thirdStudent));

        Teacher secondTeacher = new Teacher("Сидорова Мария Петровна", 1988, Disciples.LITERATURE);
        Student fourthStudents = new Student("Васильев Василий Васильевич", 2011);
        Student fifthStudent = new Student("Сергеев Сергей Сергеевич", 2012);
        Student sixthStudent = new Student("Николаева Анна Николаевна", 2011);
        List<Student> secondStudentsGroup = new ArrayList<>(Arrays.asList(fourthStudents, fifthStudent, sixthStudent));

        StudentsGroup newFirstStudentsGroup = controller.createStudentsGroup(firstStudentsGroup, firstTeacher);
        controller.read(newFirstStudentsGroup);
        StudentsGroup newSecondStudentsGroup = controller.createStudentsGroup(secondStudentsGroup, secondTeacher);
        controller.read(newSecondStudentsGroup);
    }
}