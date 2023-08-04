package com.project.Spring_Mongo.controller;

import com.project.Spring_Mongo.request.CreateUserRequest;
import com.project.Spring_Mongo.request.UpdateUserRequest;
import com.project.Spring_Mongo.response.WrapResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/{userId}")
    public WrapResponse getUser(@PathVariable("userId") String userId){
        return null;
    }
    @PostMapping("/create")
    public WrapResponse createUser(@RequestBody CreateUserRequest request){
        return null;
    }

    @PutMapping("/{userId}")
    public WrapResponse updateUser(@RequestBody UpdateUserRequest request){
        return null;
    }

}
