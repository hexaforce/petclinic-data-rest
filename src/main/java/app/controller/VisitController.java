package app.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import app.model.Visit;

@RepositoryRestResource(collectionResourceRel = "visits", path = "visit")
public interface VisitController extends JpaRepository<Visit, Integer> {

}
