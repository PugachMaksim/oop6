package org.example;



import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User implements Comparable<Teacher>{

    private Long teacherId;


    public Teacher(String firstName, String secondName, Long teacherId) {
        super(firstName, secondName);
        this.teacherId = teacherId;
    }
    public Teacher(String firstName, String secondName, String patronymic, Long teacherId) {
        super(firstName, secondName, patronymic);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
    /**
     * Принцип открытости/закрытости, здесь мы не вносим изменения в родительский класс, а просто
     * переопределяем метод/ы
     * Принцип подстановки Барбары Лисков, переопределили метод, не нарушив функциональность.
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
