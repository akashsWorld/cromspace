package com.cromxt.space.service;

import com.cromxt.space.clients.response.UserDetailsResponse;
import com.cromxt.space.entity.SpaceEntity;
import com.cromxt.space.entity.SpaceUser;

public interface EntityMapper {
    SpaceEntity getSpaceEntity(SpaceUser userDetails);
    SpaceUser getSpaceUser(UserDetailsResponse userDetails);
}
