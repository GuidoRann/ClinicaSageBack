package com.sage.ClinicaSage.services;

import com.sage.ClinicaSage.domain.User;

import java.util.List;

public interface IUserService {

    User createNewUser(String name, String Email, String Password);

    User findUserById(Long id);

    List<User> findAllUsers();

    User ModifyUser(User user);

    void DeleteUser(User user);
}
