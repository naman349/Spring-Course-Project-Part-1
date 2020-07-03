package com.upgrad.hirewheels.practice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserService {

    @Qualifier("user2")
    @Autowired
    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public void printName() {
        users.getFirstName();
    }

    @Override
    public String toString() {
        return "UserService{" +
                "firstName=" + users.getFirstName() +
                '}';
    }
}
