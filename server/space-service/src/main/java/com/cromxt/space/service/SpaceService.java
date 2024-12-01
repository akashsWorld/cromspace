package com.cromxt.space.service;


import com.cromxt.space.dtos.request.SpaceDTO;

public interface SpaceService {
    void createSpace(String username, SpaceDTO spaceDTO);

    void updateSpace(String spaceId, SpaceDTO spaceDTO);

    void deleteSpace(String spaceId);
}
