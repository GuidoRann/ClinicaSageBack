package com.sage.ClinicaSage.services;

import com.sage.ClinicaSage.domain.User;
import com.sage.ClinicaSage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createNewUser(String name, String email, String password) {
        User user = new User(name, email, password);
        return userRepository.save(user);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User ModifyUser(User user) {
        return null;
    }

    @Override
    public void DeleteUser(User user) {
        userRepository.delete(user);
    }
}
