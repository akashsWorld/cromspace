package com.cromxt.space.repository;

import com.cromxt.space.entity.SpaceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceRepository extends CrudRepository<SpaceEntity, String> {
}
