package com.upgrad.hirewheels.practice;

import org.springframework.beans.factory.annotation.Autowired;

public class BalanceService {


    private UserBalanceInterface userBalanceInterface;

    public void setUserBalanceInterface(UserBalanceInterface userBalanceInterface){
        this.userBalanceInterface=userBalanceInterface;
    }
    @Autowired
    public double checkUserBalance(){
        UserBalanceInterface userBalance=new UserBalanceImpl();
        return  userBalance.getBalance();
    }



    @Override
    public String toString() {
        return "BalanceService{" +
                "checkUserBalance=" +  checkUserBalance() +
                '}';
    }
}
