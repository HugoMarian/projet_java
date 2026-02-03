package Projet.Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Projet.Application.entities.Intervention;
import java.util.List;

public interface InterventionRepository extends JpaRepository<Intervention, Integer>{
    Intervention findById(int id);
	Intervention findTypeInterv(String typeIntervention);

    List<Intervention> findAll();
}