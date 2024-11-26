package com.cromxt.space.service;

import com.cromxt.space.clients.response.UserDetailsResponse;
import com.cromxt.space.dtos.request.SpaceDTO;
import com.cromxt.space.dtos.request.UserDTO;
import com.cromxt.space.entity.Space;
import com.cromxt.space.entity.SpaceUser;

public interface EntityMapper {
    Space getSpaceEntity(SpaceUser userDetails, SpaceDTO spaceDTO);
    SpaceUser getSpaceUser(UserDetailsResponse userDetails, UserDTO userDTO);
}
