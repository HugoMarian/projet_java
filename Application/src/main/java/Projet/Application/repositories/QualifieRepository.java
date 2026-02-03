package Projet.Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Projet.Application.entities.Qualifie;
import java.util.List;

public interface QualifieRepository extends JpaRepository<Qualifie, Integer>{
    Qualifie findById(int id);
    
    List<Qualifie> findAll();
}