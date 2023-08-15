package org.example;


import java.time.LocalDate;
import java.util.List;

public class TeacherController implements IUserController{

    private TeacherViewInterface teacherView = new TeacherView();

    @Override
    public void create(String firstName, String surName, String lastName, Long teacherId) {

    }


    public void printConsole(List<Teacher> teacher){
        teacherView.sendOnConsole(teacher);
    }
}