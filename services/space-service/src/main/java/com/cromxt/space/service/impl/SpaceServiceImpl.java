package com.cromxt.space.service.impl;

import com.cromxt.space.clients.UserHttpClient;
import com.cromxt.space.clients.response.UserDetailsResponse;
import com.cromxt.space.entity.SpaceEntity;
import com.cromxt.space.repository.SpaceRepository;
import com.cromxt.space.service.EntityMapper;
import com.cromxt.space.service.SpaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpaceServiceImpl implements SpaceService {
    private final UserHttpClient userHttpClient;
    private final SpaceRepository spaceRepository;
    private final EntityMapper entityMapper;

    @Override
    public void createSpace(String username) {
        UserDetailsResponse userDetails = userHttpClient.getUserDetails(username);
        SpaceEntity spaceEntity = entityMapper.getSpaceEntity(userDetails);
        spaceRepository.save(spaceEntity);
    }
}
