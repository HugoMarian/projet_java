package Projet.Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Projet.Application.entities.Qualification;
import java.util.List;

public interface QualificationRepository extends JpaRepository<Qualification, Integer>{
    Qualification findId(int id);
	Qualification findQualif(String qualification);
    
    List<Qualification> findAll();
}
    

