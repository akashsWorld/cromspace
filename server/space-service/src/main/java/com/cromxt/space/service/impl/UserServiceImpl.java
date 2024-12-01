package com.cromxt.space.service.impl;

import com.cromxt.space.clients.UserHttpClient;
import com.cromxt.space.clients.response.UserDetailsResponse;
import com.cromxt.space.dtos.request.UserDTO;
import com.cromxt.space.entity.SpaceUser;
import com.cromxt.space.repository.UserRepository;
import com.cromxt.space.service.EntityMapper;
import com.cromxt.space.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final EntityMapper entityMapper;
    private final UserHttpClient userHttpClient;


    @Override
    @Transactional
    public void createUser(UserDTO userDTO, String cromxtUsername) {
//        FixMe: For development purpose the Http Client is Disabled.
//        final UserDetailsResponse userDetailsResponse = userHttpClient.getUserDetails(cromxtUsername);
        SpaceUser spaceUser = entityMapper.getSpaceUser(new UserDetailsResponse(
                "lambo",
                "http://hostname:port/cromxt/imageId"
        ),userDTO);
        boolean exists = userRepository.existsById(spaceUser.getId());
        if (!exists){
            throw new RuntimeException("User already exists");
        }
        userRepository.save(spaceUser);
    }

}
