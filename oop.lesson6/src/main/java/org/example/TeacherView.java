package org.example;
import java.util.List;
public class TeacherView implements TeacherViewInterface<Teacher> {
    /**
     * Принцип единственной ответственности, данный класс выполняет только один метод печать в консоль.
     */
    /**
     * Принцип открытости/закрытости, здесь мы не вносим изменения в родительский класс, а просто
     * переопределяем метод/ы
     * Принцип подстановки Барбары Лисков, переопределили метод, не нарушив функциональность.
     */
    @Override
    public void sendOnConsole(List<Teacher> listT){
        System.out.println("Список учителей");
        for (Teacher teacher: listT) {
            System.out.println(teacher);
        }
    }
}