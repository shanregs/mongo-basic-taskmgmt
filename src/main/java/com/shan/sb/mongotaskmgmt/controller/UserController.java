package com.shan.sb.mongotaskmgmt.controller;

import com.shan.sb.mongotaskmgmt.model.User;
import com.shan.sb.mongotaskmgmt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @GetMapping("/city/{city}")
    public List<User> getByCity(@PathVariable String city) {
        return userService.getUsersByCity(city);
    }
}
