package com.cromxt.space.repository;

import com.cromxt.space.entity.SpaceUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<SpaceUser,String> {
}
