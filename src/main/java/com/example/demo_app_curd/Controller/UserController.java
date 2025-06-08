package com.example.demo_app_curd.Controller;

import com.example.demo_app_curd.DTO.UserDTO;
import com.example.demo_app_curd.Entity.User;
import com.example.demo_app_curd.Service.UserService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/controller/v1")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //http://localhost:8080/api/user/controller/v1/saveuserdetails
    @PostMapping("/saveuserdetails")
    public ResponseEntity<User> savedetails(@RequestBody User user){
       User u=userService.savedetails(user);
       return new ResponseEntity<>(u, HttpStatus.CREATED);
    }

}
