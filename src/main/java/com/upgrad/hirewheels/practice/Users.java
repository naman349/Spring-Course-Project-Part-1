package com.upgrad.hirewheels.practice;


//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
public class Users {
    private int userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String mobileNumber;
    private float walletMoney;
    private BalanceService balanceService;

    public BalanceService getBalanceService() {
        return balanceService;
    }

    public void setBalanceService(BalanceService balanceService) {
        this.balanceService = balanceService;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public float getWalletMoney() {
        return walletMoney;
    }

    public void setWalletMoney(float walletMoney) {
        this.walletMoney = walletMoney;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", walletMoney=" + walletMoney +
                ", balanceService=" + balanceService +
                '}';
    }
}