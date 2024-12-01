package com.cromxt.space.service.impl;

import com.cromxt.space.dtos.request.SpaceDTO;
import com.cromxt.space.entity.Space;
import com.cromxt.space.exception.SpaceUserNotFound;
import com.cromxt.space.repository.SpaceRepository;
import com.cromxt.space.repository.UserRepository;
import com.cromxt.space.service.EntityMapper;
import com.cromxt.space.service.SpaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpaceServiceImpl implements SpaceService {
    private final SpaceRepository spaceRepository;
    private final EntityMapper entityMapper;
    private final UserRepository userRepository;

    @Override
    public void createSpace(String username, SpaceDTO spaceDTO) {
        userRepository.findById(username).ifPresentOrElse(
                (spaceUser)->{
//                    If SpaceUser found!!
                    Space space = entityMapper.getSpaceEntity(spaceUser,spaceDTO);
                    spaceRepository.save(space);
                },
                ()-> {
                    throw new SpaceUserNotFound("Space user not found with " + username);
                }
        );
    }

    @Override
    public void updateSpace(String spaceId, SpaceDTO spaceDTO) {
        spaceRepository.findById(spaceId).ifPresentOrElse(
                space -> {
                    Space updatedSpace = entityMapper.updateSpace(space, spaceDTO);
                    spaceRepository.save(updatedSpace);
                }
                ,()->{
                    throw new SpaceUserNotFound("Space user not found with " + spaceId);
                }
        );
    }

    @Override
    public void deleteSpace(String spaceId) {
        boolean exist = spaceRepository.existsById(spaceId);
        if(!exist){
            throw new SpaceUserNotFound("Space user not found with " + spaceId);
        }
        spaceRepository.deleteById(spaceId);
    }
}
