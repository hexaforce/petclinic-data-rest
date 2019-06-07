package app.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import app.model.Specialty;

@RepositoryRestResource(collectionResourceRel = "specialties", path = "specialtie")
public interface SpecialtyController extends JpaRepository<Specialty, Integer> {

}
