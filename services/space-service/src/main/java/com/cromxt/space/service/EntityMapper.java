package com.cromxt.space.service;

import com.cromxt.space.clients.response.UserDetailsResponse;
import com.cromxt.space.entity.SpaceEntity;

public interface EntityMapper {
    SpaceEntity getSpaceEntity(UserDetailsResponse userDetails);
}
