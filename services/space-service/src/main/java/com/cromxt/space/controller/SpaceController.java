package com.cromxt.space.controller;

import com.cromxt.space.dtos.request.SpaceDTO;
import com.cromxt.space.service.SpaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    @PutMapping(value = "/{spaceId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateSpace(@PathVariable String spaceId,@RequestBody SpaceDTO spaceDTO){
        spaceService.updateSpace(spaceId,spaceDTO);
    }

    @DeleteMapping(value = "/{spaceId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSpace(@PathVariable String spaceId){
        spaceService.deleteSpace(spaceId);
    }


    @PostMapping(value = "/image/{username}")
    public void updateImage(@RequestParam("spaceImage") MultipartFile multipartFile
            ,@PathVariable String username){
//        TODO: Implement the logic to update the image.
    }

}
