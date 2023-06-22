package seminar6;

import java.time.LocalDate;

public class Teacher extends User {
    /*
    Класс Teacher наследует от класса User.
    Класс Teacher имеет только одну зону ответственности - работу с учителями.
    Также класс Teacher соответствует принципу открытости и закрытости. Он расширяет класс User.
     */

    private Long teacherId;

    public Teacher(long teacherID, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherID;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
}