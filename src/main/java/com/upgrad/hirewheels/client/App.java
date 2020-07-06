package com.upgrad.hirewheels.client;

import com.upgrad.hirewheels.daos.UserDAO;
import com.upgrad.hirewheels.models.User;
import com.upgrad.hirewheels.practice.BalanceService;
import com.upgrad.hirewheels.practice.UserService;
import com.upgrad.hirewheels.practice.Users;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public  static  void main(String[] argu){

        ClassPathXmlApplicationContext context;
        context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Users use =  (Users)context.getBean("user1");
        System.out.println(use);


        BalanceService balanceService = (BalanceService) context.getBean("balanceService");
        System.out.println(balanceService.checkUserBalance());


        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService);

        System.out.println("-------------------------------------Checkpoint 3 Solution---------------------------------------");
        User user = new User("mnama42@gmail","naman","mittal","7457030433","12345678",10000.0f,1);

        UserDAO userDAO = (UserDAO) context.getBean("userDAO");

//        System.out.println("-------------------------------------Inserted Users Details---------------------------------------");
        User savedUser;
        userDAO.insertUsersDetails(user);

        //System.out.println("-------------------------------------Fetch All User Details---------------------------------------");
        //System.out.println(userDAO.fetchAllUsersDetails());
        //System.out.println("-------------------------------------Fetch User Details by Id---------------------------------------");
        //System.out.println(userDAO.fetchUserDetails(2));
        //System.out.println("-------------------------------------Deleted User Detail by Id---------------------------------------");
        //System.out.println(userDAO.deleteUser(2));



    }

}