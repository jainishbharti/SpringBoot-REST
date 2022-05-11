package com.springDataRest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springDataRest.model.Alien;


@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
public interface AlienRepository extends JpaRepository<Alien, Integer>{

}
