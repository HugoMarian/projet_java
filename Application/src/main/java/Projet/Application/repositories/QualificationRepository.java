package Projet.Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Projet.Application.entities.Qualification;
import java.util.List;

public interface QualificationRepository extends JpaRepository<Qualification, Integer>{
    Qualification findById(int id);
	Qualification findByQualification(String qualification);
    
    List<Qualification> findAll();
}
    

