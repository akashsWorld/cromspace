package com.cromxt.space.service.impl;

import com.cromxt.space.clients.response.UserDetailsResponse;
import com.cromxt.space.entity.SpaceEntity;
import com.cromxt.space.service.EntityMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EntityMapperImplTest {

    @Autowired
    EntityMapper entityMapper;

    SpaceEntity spaceEntity;

    @BeforeEach
    void setUp() {
        this.spaceEntity = SpaceEntity.builder().ownerName("lambo").build();
    }

    @Test
    void shouldReturnSpaceEntity() {
        SpaceEntity lamboEntity = entityMapper.getSpaceEntity(new UserDetailsResponse("lambo"));
        assertThat(lamboEntity.getOwnerName()).isEqualTo(this.spaceEntity.getOwnerName());
    }

}