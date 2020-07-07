
package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.User;


import java.util.List;

public interface UserDAO {

    public User insertUsersDetails(User user);
    public User updatePassword(int id);
    public User fetchUserDetails(int userId);
    public List<User> fetchAllUsersDetails();
    public boolean deleteUser(int userId);


    //in this user login through emailid and password
    public User loginUser(String email,String password);

   // public User forgotPassword(String password);

}