package org.example;

import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teacherList;
    private String klass;
    public TeacherGroup(String klass, List<Teacher> teacherList){
        this.klass = klass;
        this.teacherList = teacherList;
    }
    public List<Teacher> getTeacherList(){
        return teacherList;
    }
    public void setTeacherList(List<Teacher> teacherList){
        this.teacherList = teacherList;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public void createTeacher(User user){
        teacherList.add((Teacher) user);
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teacherList=" + teacherList +
                ", since='" + klass + '\'' +
                '}';
    }

    @Override
    public TeacherGroupIterator iterator() {
        return new TeacherGroupIterator(this);
    }

}
