package app.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import app.model.Pet;

@RepositoryRestResource(collectionResourceRel = "pets", path = "pet")
public interface PetController extends JpaRepository<Pet, Integer> {

}
