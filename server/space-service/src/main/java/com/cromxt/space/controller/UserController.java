package com.cromxt.space.controller;


import com.cromxt.space.dtos.request.UserDTO;
import com.cromxt.space.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/susers")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/{username}")
    @ResponseStatus(HttpStatus.CREATED)
    public void createSpaceUser(@RequestBody UserDTO userDTO,
                                @PathVariable("username") String cromxtUsername){
        userService.createUser(userDTO,cromxtUsername);
    }

    @PostMapping(value = "image/{username}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateImage(@RequestParam("profileImage") MultipartFile multipartFile,
                            @PathVariable String username){
//        Todo: Implement the logic to update the image.

    }
}
