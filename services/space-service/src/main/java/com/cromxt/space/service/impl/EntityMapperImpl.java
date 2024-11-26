package com.cromxt.space.service.impl;

import com.cromxt.space.clients.response.UserDetailsResponse;
import com.cromxt.space.entity.SpaceEntity;
import com.cromxt.space.entity.SpaceUser;
import com.cromxt.space.service.EntityMapper;
import org.springframework.stereotype.Service;

@Service
public class EntityMapperImpl implements EntityMapper {
    @Override
    public SpaceEntity getSpaceEntity(SpaceUser spaceUser) {
        return SpaceEntity.builder()
                .owner(spaceUser)
                .build();
    }

    @Override
    public SpaceUser getSpaceUser(UserDetailsResponse userDetails) {
        return null;
    }
}
