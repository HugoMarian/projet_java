package Projet.Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Projet.Application.entities.Batiment;
import java.util.List;

public interface BatimentRepository extends JpaRepository<Batiment, Integer>{
    Batiment findId(int id);
	Batiment findNom(String nom);
	Batiment findLocalisation(String localisation);
    
    List<Batiment> findAll();
}