package seminar6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Андрей", "Андреев", "Андреевич",
                LocalDate.now());
        Student student2 = new Student(2, "Игорь", "Сидоров", "Петрович",
                LocalDate.now());
        Student student3 = new Student(3, "Алексей", "Самошников", "Николаевич",
                LocalDate.now());
        Student student4 = new Student(4, "Иван", "Петров", "Дмитриевич",
                LocalDate.now());
        Student student5 = new Student(5, "Сергей", "Иванов", "Васильевич",
                LocalDate.now());

        List<Student> students = new ArrayList<>();
        students.add(student3);
        students.add(student2);
        students.add(student1);
        students.add(student5);
        students.add(student4);

        System.out.println("Студенты: \n" + students + "\n");
        students.sort(new UserComparator<>());
        System.out.println("Остортированный список студентов: \n" + students + "\n");

        System.out.println("Пример работы итератора: ");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
//        for (Student student : students) {
//            System.out.println(student.toString());
//        }

        List<Student> studentsGroup = new ArrayList<>();
        studentsGroup.add(student3);
        studentsGroup.add(student2);
        studentsGroup.add(student1);
        studentsGroup.add(student5);
        studentsGroup.add(student4);

        StudentGroup studentGroup = new StudentGroup(studentsGroup);
        System.out.println("\nГруппа студентов: \n" + studentGroup +"\n");
        StudentGroupIterator studentGroupIterator = studentGroup.iterator();
        while (studentGroupIterator.hasNext()) {
            System.out.println(studentGroupIterator.next().toString());
        }

        System.out.println("\n<!-------------------!>\n");

        Teacher teacher1 = new Teacher(1, "Петр", "Пушков", "Николаевич",
                LocalDate.now());
        Teacher teacher2 = new Teacher(2, "Николай", "Молочков", "Петрович",
                LocalDate.now());
        Teacher teacher3 = new Teacher(3, "Всеволод", "Нарышкин", "Николаевич",
                LocalDate.now());
        Teacher teacher4 = new Teacher(4, "Петр", "Иванов", "Сергеевич",
                LocalDate.now());
        Teacher teacher5 = new Teacher(5, "Дмитрий", "Пучков", "Васильевич",
                LocalDate.now());

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher3);
        teachers.add(teacher2);
        teachers.add(teacher1);
        teachers.add(teacher5);
        teachers.add(teacher4);

        System.out.println("Преподаватели: \n" + teachers + "\n");
        teachers.sort(new UserComparator<>());
        System.out.println("Остортированный список преподавателей: \n" + teachers + "\n");

        System.out.println("Пример работы итератора: ");
        Iterator<Teacher> iteratorTeachers = teachers.iterator();
        while (iteratorTeachers.hasNext()) {
            System.out.println(iteratorTeachers.next().toString());
        }

        List<Teacher> teachersGroup = new ArrayList<>();
        teachersGroup.add(teacher3);
        teachersGroup.add(teacher2);
        teachersGroup.add(teacher1);
        teachersGroup.add(teacher5);
        teachersGroup.add(teacher4);

        TeacherGroup teacherGroup = new TeacherGroup(teachersGroup);
        System.out.println("\nГруппа преподавателей: \n" + teacherGroup +"\n");
        TeacherGroupIterator teacherGroupIterator = teacherGroup.iterator();
        while (teacherGroupIterator.hasNext()) {
            System.out.println(teacherGroupIterator.next().toString());
        }
    }
}