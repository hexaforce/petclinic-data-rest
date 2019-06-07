package app.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import app.model.PetType;

@RepositoryRestResource(collectionResourceRel = "types", path = "type")
public interface PetTypeController extends JpaRepository<PetType, Integer> {

}
