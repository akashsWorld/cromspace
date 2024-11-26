package com.cromxt.space.repository;

import com.cromxt.space.entity.Space;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceRepository extends CrudRepository<Space, String> {
}
