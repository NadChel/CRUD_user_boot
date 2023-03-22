package my_pp.crud_user_boot.dao;


import my_pp.crud_user_boot.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(long id);

    void deleteUserById(long id);
}
