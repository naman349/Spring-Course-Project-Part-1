
package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.User;


import java.util.List;

public interface UserDAO {

    public User insertUsersDetails(User user);
    public User updatePassword(int id);
    public User fetchUserDetails(int userId);
    public List<User> fetchAllUsersDetails();
    public boolean deleteUser(int userId);

}