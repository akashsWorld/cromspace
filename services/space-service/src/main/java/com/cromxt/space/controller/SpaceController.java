package com.cromxt.space.controller;

import com.cromxt.space.dtos.request.SpaceDTO;
import com.cromxt.space.service.SpaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/spaces")
@RequiredArgsConstructor
public class SpaceController {

    private final SpaceService spaceService;

    @PostMapping(value = "/{username}")
    @ResponseStatus(HttpStatus.CREATED)
    public void createSpace(@PathVariable String username, @RequestBody SpaceDTO spaceDTO) {
        spaceService.createSpace(username,spaceDTO);
    }
}
