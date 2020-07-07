package com.upgrad.hirewheels.models;

//import lombok.Getter;
//import lombok.Setter;
import javax.persistence.*;


    //@Table(name="User_table")
    //in this class i make User instead of Users acording to hirewheel application schema
    @Entity
    @Table(name="User")
    public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column( nullable = false)
    private String firstName;

    @Column( nullable = false)
    private String lastName;

    @Column( nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String mobileNumber;


    private float walletMoney;

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



        public User() {}

    public User(  String email, String firstName, String lastName, String mobileNumber,String password, float walletMoney,int userId) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.walletMoney = walletMoney;
    }

        @Override
        public String toString() {
            return "User{" +
                    "userId=" + userId +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", password='" + password + '\'' +
                    ", email='" + email + '\'' +
                    ", mobileNumber='" + mobileNumber + '\'' +
                    ", walletMoney=" + walletMoney +
                    '}';
        }
    }
