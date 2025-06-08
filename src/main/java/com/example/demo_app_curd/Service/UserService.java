package com.example.demo_app_curd.Service;


import com.example.demo_app_curd.DTO.UserDTO;
import com.example.demo_app_curd.Entity.User;
import com.example.demo_app_curd.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User savedetails(User user){
        User save = userRepository.save(user);
        return user;

    }
}
