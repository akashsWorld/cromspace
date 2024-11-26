package com.cromxt.space.controller;


import com.cromxt.space.dtos.request.UserDTO;
import com.cromxt.space.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/susers")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/{username}")
    public void createSpaceUser(@RequestBody UserDTO userDTO, @PathVariable("username") String cromxtUsername){
        userService.createUser(userDTO,cromxtUsername);
    }
}
