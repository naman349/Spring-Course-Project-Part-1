package com.upgrad.hirewheels.client;

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



    }

}