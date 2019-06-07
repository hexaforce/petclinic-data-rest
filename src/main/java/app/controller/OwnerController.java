package app.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import app.model.Owner;

@RepositoryRestResource(collectionResourceRel = "owners", path = "owner")
public interface OwnerController extends JpaRepository<Owner, Integer> {

}
