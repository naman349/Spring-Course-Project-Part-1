
package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
import java.util.List;

@Component(value="userDAO")
public class UserDAOImpl implements UserDAO {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    //@Transactional
    public User insertUsersDetails(User user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
        return user;
    }

    public User updatePassword(int Id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        User user = entityManager.find(User.class,Id);
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
        return user;
    }

    public User fetchUserDetails(int userId) {
        return entityManagerFactory.createEntityManager().find(User.class, userId);
    }

    public List<User> fetchAllUsersDetails() {
        Query query = entityManagerFactory.createEntityManager().createQuery("from Users m",User.class);
        return (List<User>)query.getResultList();
    }

    public boolean deleteUser(int userId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        User user = entityManager.find(User.class,userId);
        entityManager.getTransaction().begin();
        entityManager.remove(user);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public User loginUser(String email, String password) {
        return entityManagerFactory.createEntityManager().find(User.class, email, LockModeType.valueOf(password));
    }

//
//    @Override
//    public User forgotPassword(String password) {
//        return entityManagerFactory.createEntityManager().find();;
//    }


}