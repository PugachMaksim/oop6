package org.example;

public interface IUserController <T extends User>{
    /**
     * Принцип единственной ответственности, данный интерфейс выполняет только одну функцию создать юзера.
     * Принцип разделения интерфейса
     */
    void create(String firstName, String surName, String lastName, Long teacherId);
}