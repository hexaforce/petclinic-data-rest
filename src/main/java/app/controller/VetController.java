package app.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import app.model.Vet;

@RepositoryRestResource(collectionResourceRel = "vets", path = "vet")
public interface VetController extends JpaRepository<Vet, Integer> {

}
