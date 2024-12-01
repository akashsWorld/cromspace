package com.cromxt.space.service;

import com.cromxt.space.dtos.request.UserDTO;

public interface UserService {
    void createUser(UserDTO userDTO, String cromxtUsername);
}
