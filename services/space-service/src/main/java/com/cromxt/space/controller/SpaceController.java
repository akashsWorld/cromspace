package com.cromxt.space.controller;

import com.cromxt.space.clients.UserHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/spaces")
@RequiredArgsConstructor
public class SpaceController {

    private final UserHttpClient userHttpClient;

    @PostMapping(value = "/{username}")
    @ResponseStatus(HttpStatus.CREATED)
    public void createSpace(@PathVariable String username) {
        System.out.println(userHttpClient.getUserDetails(username));
    }
}
