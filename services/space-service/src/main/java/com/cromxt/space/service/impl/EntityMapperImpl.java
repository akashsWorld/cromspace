package com.cromxt.space.service.impl;

import com.cromxt.space.clients.response.UserDetailsResponse;
import com.cromxt.space.entity.SpaceEntity;
import com.cromxt.space.service.EntityMapper;
import org.springframework.stereotype.Service;

@Service
public class EntityMapperImpl implements EntityMapper {
    @Override
    public SpaceEntity getSpaceEntity(UserDetailsResponse userDetails) {
        return SpaceEntity.builder()
                .ownerName(userDetails.username())
                .build();
    }
}
