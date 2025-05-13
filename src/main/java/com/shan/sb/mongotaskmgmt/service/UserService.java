package com.shan.sb.mongotaskmgmt.service;

import com.shan.sb.mongotaskmgmt.model.User;
import com.shan.sb.mongotaskmgmt.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsersByCity(String city) {
        return userRepository.findByCity(city);
    }
}
