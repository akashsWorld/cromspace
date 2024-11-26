package com.cromxt.space.service.impl;

import com.cromxt.space.clients.response.UserDetailsResponse;
import com.cromxt.space.dtos.request.SpaceDTO;
import com.cromxt.space.dtos.request.UserDTO;
import com.cromxt.space.entity.Space;
import com.cromxt.space.entity.SpaceUser;
import com.cromxt.space.service.EntityMapper;
import com.cromxt.space.service.UtilService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EntityMapperImpl implements EntityMapper {
    private final UtilService utilService;
    @Override
    public Space getSpaceEntity(SpaceUser spaceUser, SpaceDTO spaceDTO) {
        return Space.builder()
                .spaceName(spaceDTO.spaceName())
                .description(spaceDTO.description())
                .owner(spaceUser)
                .spaceImageUrl(utilService.getSpaceAvatar())
                .build();
    }

    @Override
    public SpaceUser getSpaceUser(UserDetailsResponse userDetails, UserDTO userDTO) {
        return SpaceUser.builder()
                .id(userDetails.username())
                .spaceName(userDTO.name())
                .bio(userDTO.bio())
                .profileImage(userDetails.profileImageUrl())
                .build();
    }
}
