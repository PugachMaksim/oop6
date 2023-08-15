package org.example;

import java.util.List;

public interface TeacherViewInterface<T extends User> {
    /**
     * Принцип единственной ответственности, данный интерфейс выполняет только один метод печати.
     * Принцип разделения интерфейса
     */
    public void sendOnConsole(List<T> listT);
}