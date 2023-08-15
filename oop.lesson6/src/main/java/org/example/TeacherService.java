package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    private List<User> users;

    public TeacherService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic) {
        Long countMaxId = 0L;
        for (User user: this.users){
            if(user instanceof Teacher){
                if (((Teacher) user).getTeacherId() > countMaxId){
                    countMaxId = ((Teacher) user).getTeacherId();
                }
            }
        }
        countMaxId++;

        Teacher teacher = new Teacher(firstName, secondName, patronymic, countMaxId);
        this.users.add(teacher);
    }
}