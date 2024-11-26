package com.cromxt.space.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "space_user")
public class SpaceUser {
    @Id
    private String username;
    @OneToMany(mappedBy = "owner")
    private Set<SpaceEntity> spaceEntities;
}
